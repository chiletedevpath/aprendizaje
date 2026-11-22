import { useState } from "react";
import { useRequest } from "alova/client";
import { api } from "./servicios/api";

function App() {
  const [id, setId] = useState("1");
  const [consultado, setConsultado] = useState(false);
  const [aviso, setAviso] = useState("");

  const {
    data: publicacion,
    loading,
    error,
    send
  } = useRequest((idPost) => api.Get(`/posts/${idPost}`), {
    immediate: false,
    force: true
  });

  const buscarPublicacion = async (evento) => {
    evento.preventDefault();
    const numero = Number(id);

    if (!Number.isInteger(numero) || numero < 1) {
      setAviso("Ingresa un ID válido mayor que cero.");
      setConsultado(false);
      return;
    }

    setAviso("");
    setConsultado(true);

    try {
      await send(numero);
    } catch {
      setAviso("No se pudo completar la consulta. Verifica tu conexión.");
    }
  };

  return (
    <main className="contenedor">
      <header>
        <p className="etiqueta">REACT · ALOVA · API</p>
        <h1>Buscador de publicaciones</h1>
        <p>Consulta una publicación por su ID utilizando React, Alova y JSONPlaceholder.</p>
      </header>

      <aside className="nota-aprendizaje">
        <strong>Chilete DevPath explica:</strong> la configuración del cliente vive en un módulo
        separado y <code>useRequest</code> expone datos, carga y error. La solicitud no se ejecuta
        al renderizar: <code>send()</code> se llama después de validar el formulario. Observa cómo
        la interfaz distingue entre error de red, recurso inexistente y respuesta correcta.
      </aside>

      <section className="panel" aria-labelledby="titulo-busqueda">
        <h2 id="titulo-busqueda">Buscar publicación</h2>
        <form onSubmit={buscarPublicacion}>
          <label htmlFor="id-post">ID de la publicación</label>
          <div className="fila-formulario">
            <input
              id="id-post"
              type="number"
              min="1"
              step="1"
              value={id}
              onChange={(evento) => setId(evento.target.value)}
              placeholder="Ejemplo: 1"
              required
            />
            <button type="submit" disabled={loading}>
              {loading ? "Buscando..." : "Buscar publicación"}
            </button>
          </div>
        </form>
        <p className="ayuda">Los ID del 1 al 100 devuelven datos; otro valor permite observar el estado vacío.</p>
      </section>

      {aviso && (
        <p className="mensaje error" role="alert">
          {aviso}
        </p>
      )}
      {loading && (
        <p className="mensaje" role="status">
          Consultando la API...
        </p>
      )}
      {error && !aviso && (
        <p className="mensaje error" role="alert">
          {error.message}
        </p>
      )}

      {consultado && !loading && !error && !aviso && publicacion === null && (
        <p className="mensaje" role="status">
          No se encontró una publicación con ese ID.
        </p>
      )}

      {consultado && !loading && !error && !aviso && publicacion && (
        <section className="panel resultado" aria-labelledby="titulo-resultado">
          <h2 id="titulo-resultado">Resultado de la búsqueda</h2>
          <p>
            <strong>ID:</strong> {publicacion.id}
          </p>
          <p>
            <strong>Usuario:</strong> {publicacion.userId}
          </p>
          <p>
            <strong>Título:</strong> {publicacion.title}
          </p>
          <p>
            <strong>Contenido:</strong>
          </p>
          <p className="contenido">{publicacion.body}</p>
        </section>
      )}

      <section className="panel">
        <h2>Estado de la consulta</h2>

        <p>
          <strong>Consultado:</strong> {String(consultado)}
        </p>
        <p>
          <strong>Loading:</strong> {String(loading)}
        </p>
        <p>
          <strong>Error:</strong> {error ? error.message : "Ninguno"}
        </p>
        <p>
          <strong>Aviso:</strong> {aviso || "Ninguno"}
        </p>
      </section>

      <footer>Práctica educativa · Chilete DevPath</footer>
    </main>
  );
}

export default App;
