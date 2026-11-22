import { useState } from "react";
import { useRequest } from "alova/client";
import { obtenerRepositorios, obtenerDetalleRepositorio } from "../services/apis";

const TAMANO_PAGINA = 20;

function ConsultaRepositorios() {
  const [usuario, setUsuario] = useState("octocat");
  const [usuarioConsultado, setUsuarioConsultado] = useState("");
  const [repositorios, setRepositorios] = useState([]);
  const [pagina, setPagina] = useState(1);
  const [consultado, setConsultado] = useState(false);
  const [mensaje, setMensaje] = useState("");
  const [detalle, setDetalle] = useState(null);
  const [idSeleccionado, setIdSeleccionado] = useState(null);
  const [mensajeDetalle, setMensajeDetalle] = useState("");

  const { loading: cargandoLista, send: enviarLista } = useRequest(
    (nombre, numeroPagina) => obtenerRepositorios(nombre, numeroPagina),
    { immediate: false, force: true }
  );

  const { loading: cargandoDetalle, send: enviarDetalle } = useRequest(
    (propietario, nombre) => obtenerDetalleRepositorio(propietario, nombre),
    { immediate: false, force: true }
  );

  const cargarPagina = async (nombre, numeroPagina) => {
    setMensaje("");
    setRepositorios([]);
    setDetalle(null);
    setIdSeleccionado(null);
    setMensajeDetalle("");

    try {
      const datos = await enviarLista(nombre, numeroPagina);
      if (!Array.isArray(datos)) {
        throw new Error("La API no devolvió una lista de repositorios.");
      }
      setRepositorios(datos);
      setPagina(numeroPagina);
      setUsuarioConsultado(nombre);
      setConsultado(true);
    } catch (error) {
      setConsultado(false);
      setMensaje(error.message || "No se pudo realizar la búsqueda.");
    }
  };

  const buscar = async (evento) => {
    evento.preventDefault();
    const nombre = usuario.trim();
    setConsultado(false);

    if (!/^[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,37}[a-zA-Z0-9])?$/.test(nombre)) {
      setRepositorios([]);
      setDetalle(null);
      setMensaje("Ingresa un nombre de usuario de GitHub válido.");
      return;
    }

    await cargarPagina(nombre, 1);
  };

  const seleccionar = async (repositorio) => {
    setIdSeleccionado(repositorio.id);
    setDetalle(null);
    setMensajeDetalle("");

    try {
      const datos = await enviarDetalle(repositorio.owner.login, repositorio.name);
      setDetalle(datos);
    } catch (error) {
      setMensajeDetalle(error.message || "No se pudo consultar el repositorio.");
    }
  };

  const cambiarPagina = (desplazamiento) => {
    if (cargandoLista) return;
    const siguiente = pagina + desplazamiento;
    if (siguiente < 1) return;
    cargarPagina(usuarioConsultado, siguiente);
  };

  return (
    <section aria-labelledby="titulo-repositorios">
      <h2 className="h4 mb-3" id="titulo-repositorios">Repositorios públicos</h2>
      <p className="text-secondary">
        Ingresa un nombre de usuario de GitHub para consultar sus repositorios públicos.
      </p>
      <form onSubmit={buscar} className="card mb-3">
        <div className="card-body">
          <label htmlFor="github-usuario" className="form-label">Usuario de GitHub (login)</label>
          <div className="d-flex gap-2 flex-wrap">
            <input
              id="github-usuario"
              className="form-control campo-usuario"
              value={usuario}
              onChange={(evento) => setUsuario(evento.target.value)}
              placeholder="Ejemplo: octocat"
              autoComplete="off"
              required
            />
            <button type="submit" className="btn btn-primary" disabled={cargandoLista || cargandoDetalle}>
              {cargandoLista ? "Buscando..." : "Buscar repositorios"}
            </button>
          </div>
        </div>
      </form>

      {mensaje && <div className="alert alert-warning" role="alert">{mensaje}</div>}
      {cargandoLista && <p role="status">Consultando repositorios...</p>}
      {consultado && !cargandoLista && repositorios.length === 0 && (
        <p className="alert alert-info" role="status">No se encontraron repositorios públicos en esta página.</p>
      )}

      {consultado && repositorios.length > 0 && !cargandoLista && (
        <div className="card mb-3">
          <div className="card-body">
            <h3 className="h5">Repositorios de {usuarioConsultado}</h3>
            <p className="small text-secondary mb-3">Página {pagina}. Selecciona un repositorio para consultar más información.</p>
            <div className="list-group">
              {repositorios.map((repo) => (
                <button
                  type="button"
                  className={`list-group-item list-group-item-action text-start ${idSeleccionado === repo.id ? "active" : ""}`}
                  onClick={() => seleccionar(repo)}
                  key={repo.id}
                  disabled={cargandoDetalle}
                >
                  <span className="fw-semibold">{repo.name}</span>
                  <span className="d-block small">{repo.description || "Sin descripción"}</span>
                </button>
              ))}
            </div>
            <div className="d-flex align-items-center gap-2 mt-3">
              <button type="button" className="btn btn-outline-secondary btn-sm" disabled={pagina <= 1 || cargandoLista} onClick={() => cambiarPagina(-1)}>
                Anterior
              </button>
              <span className="small">Página {pagina}</span>
              <button type="button" className="btn btn-outline-secondary btn-sm" disabled={repositorios.length < TAMANO_PAGINA || cargandoLista} onClick={() => cambiarPagina(1)}>
                Siguiente
              </button>
            </div>
          </div>
        </div>
      )}

      {cargandoDetalle && <p role="status">Consultando los detalles del repositorio...</p>}
      {mensajeDetalle && <div className="alert alert-warning" role="alert">{mensajeDetalle}</div>}
      {detalle && !cargandoDetalle && (
        <section className="card mb-3" aria-labelledby="titulo-detalle">
          <div className="card-body">
            <h3 id="titulo-detalle" className="h5 mb-3">Detalle del repositorio</h3>
            <dl className="row mb-2">
              <dt className="col-sm-4">Nombre</dt><dd className="col-sm-8">{detalle.full_name}</dd>
              <dt className="col-sm-4">Descripción</dt><dd className="col-sm-8">{detalle.description || "Sin descripción"}</dd>
              <dt className="col-sm-4">Lenguaje</dt><dd className="col-sm-8">{detalle.language || "No especificado"}</dd>
              <dt className="col-sm-4">Estrellas</dt><dd className="col-sm-8">{detalle.stargazers_count}</dd>
              <dt className="col-sm-4">Forks</dt><dd className="col-sm-8">{detalle.forks_count}</dd>
              <dt className="col-sm-4">Rama principal</dt><dd className="col-sm-8">{detalle.default_branch}</dd>
            </dl>
            <a className="btn btn-outline-primary btn-sm" href={detalle.html_url} target="_blank" rel="noreferrer">Abrir en GitHub</a>
          </div>
        </section>
      )}
    </section>
  );
}

export default ConsultaRepositorios;
