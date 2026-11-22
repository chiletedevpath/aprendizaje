import { useEffect, useMemo, useState } from "react";
import { apiBlog } from "../services/api.js";
import { filtrarPostsPorInicial } from "../utils/filtros.js";

function BlogPosts() {
  const [posts, setPosts] = useState([]);
  const [cargandoPosts, setCargandoPosts] = useState(true);
  const [errorPosts, setErrorPosts] = useState("");
  const [idSeleccionado, setIdSeleccionado] = useState(null);
  const [detalle, setDetalle] = useState(null);
  const [comentarios, setComentarios] = useState([]);
  const [cargandoDetalle, setCargandoDetalle] = useState(false);
  const [cargandoComentarios, setCargandoComentarios] = useState(false);
  const [errorDetalle, setErrorDetalle] = useState("");
  const [errorComentarios, setErrorComentarios] = useState("");
  const [inicial, setInicial] = useState("a");

  useEffect(() => {
    const controlador = new AbortController();

    const cargarPosts = async () => {
      setCargandoPosts(true);
      setErrorPosts("");

      try {
        const respuesta = await apiBlog.get("/posts", {
          signal: controlador.signal,
        });
        if (!controlador.signal.aborted) setPosts(respuesta.data);
      } catch {
        if (!controlador.signal.aborted) {
          setErrorPosts("No se pudieron cargar las publicaciones.");
        }
      } finally {
        if (!controlador.signal.aborted) setCargandoPosts(false);
      }
    };

    cargarPosts();
    return () => controlador.abort();
  }, []);

  const postsFiltrados = useMemo(
    () => filtrarPostsPorInicial(posts, inicial),
    [posts, inicial]
  );

  useEffect(() => {
    if (idSeleccionado === null) return;
    const controlador = new AbortController();

    const consultarPost = async () => {
      setDetalle(null);
      setComentarios([]);
      setErrorDetalle("");
      setErrorComentarios("");
      setCargandoDetalle(true);
      setCargandoComentarios(false);

      try {
        const respuesta = await apiBlog.get(`/posts/${idSeleccionado}`, {
          signal: controlador.signal,
        });
        if (controlador.signal.aborted) return;
        setDetalle(respuesta.data);
      } catch {
        if (!controlador.signal.aborted) {
          setErrorDetalle("No se pudo consultar el detalle de la publicación.");
        }
        return;
      } finally {
        if (!controlador.signal.aborted) setCargandoDetalle(false);
      }

      if (controlador.signal.aborted) return;
      setCargandoComentarios(true);

      try {
        const respuesta = await apiBlog.get(`/posts/${idSeleccionado}/comments`, {
          signal: controlador.signal,
        });
        if (!controlador.signal.aborted) setComentarios(respuesta.data);
      } catch {
        if (!controlador.signal.aborted) {
          setErrorComentarios("No se pudieron cargar los comentarios.");
        }
      } finally {
        if (!controlador.signal.aborted) setCargandoComentarios(false);
      }
    };

    consultarPost();
    return () => controlador.abort();
  }, [idSeleccionado]);

  return (
    <section aria-labelledby="titulo-blog">
      <h2 id="titulo-blog" className="h4">Blog de publicaciones</h2>
      <p className="text-secondary">
        Axios descarga las publicaciones y luego permite consultar detalle y comentarios.
      </p>
      <div className="mb-3 filtro-inicial">
        <label className="form-label" htmlFor="inicial-post">Inicial del título</label>
        <input
          id="inicial-post"
          className="form-control text-uppercase"
          value={inicial}
          onChange={(evento) => setInicial(evento.target.value.slice(0, 1))}
          maxLength="1"
          aria-describedby="ayuda-inicial"
        />
        <div className="form-text" id="ayuda-inicial">
          El filtrado ocurre en memoria y no genera una nueva petición.
        </div>
      </div>

      {cargandoPosts && <p role="status">Cargando publicaciones...</p>}
      {errorPosts && <div className="alert alert-danger" role="alert">{errorPosts}</div>}

      {!cargandoPosts && !errorPosts && (
        <div className="row g-4">
          <div className="col-lg-5">
            <h3 className="h5">Publicaciones ({postsFiltrados.length})</h3>
            {postsFiltrados.length > 0 ? (
              <div className="list-group lista-posts">
                {postsFiltrados.map((post) => (
                  <button
                    key={post.id}
                    type="button"
                    className={`list-group-item list-group-item-action ${idSeleccionado === post.id ? "active" : ""}`}
                    onClick={() => setIdSeleccionado(post.id)}
                    aria-pressed={idSeleccionado === post.id}
                  >
                    <span className="me-2">#{post.id}</span>{post.title}
                  </button>
                ))}
              </div>
            ) : (
              <p className="alert alert-secondary">No hay publicaciones con esa inicial.</p>
            )}
          </div>

          <div className="col-lg-7">
            <h3 className="h5">Detalle y comentarios</h3>
            {idSeleccionado === null && (
              <p className="alert alert-secondary">Selecciona una publicación de la lista.</p>
            )}
            {cargandoDetalle && <p role="status">Consultando detalle...</p>}
            {errorDetalle && <div className="alert alert-danger" role="alert">{errorDetalle}</div>}

            {detalle?.id === idSeleccionado && (
              <article className="border rounded p-3 bg-white">
                <p className="small text-secondary mb-2">
                  Publicación #{detalle.id} · Usuario #{detalle.userId}
                </p>
                <h4 className="h6 text-capitalize">{detalle.title}</h4>
                <p className="mb-0 texto-post">{detalle.body}</p>
              </article>
            )}

            {idSeleccionado !== null && !errorDetalle && !cargandoDetalle && (
              <div className="mt-3">
                <h4 className="h6">Comentarios ({comentarios.length})</h4>
                {cargandoComentarios && <p role="status">Consultando comentarios...</p>}
                {errorComentarios && (
                  <div className="alert alert-danger" role="alert">{errorComentarios}</div>
                )}
                {!cargandoComentarios && !errorComentarios && comentarios.length === 0 && (
                  <p className="text-secondary">No hay comentarios para esta publicación.</p>
                )}
                {!errorComentarios && comentarios.map((comentario) => (
                  <div className="border rounded p-3 mb-2 bg-white" key={comentario.id}>
                    <p className="fw-semibold mb-1">{comentario.name}</p>
                    <p className="small text-secondary mb-2">{comentario.email}</p>
                    <p className="mb-0 texto-post">{comentario.body}</p>
                  </div>
                ))}
              </div>
            )}
          </div>
        </div>
      )}
    </section>
  );
}

export default BlogPosts;
