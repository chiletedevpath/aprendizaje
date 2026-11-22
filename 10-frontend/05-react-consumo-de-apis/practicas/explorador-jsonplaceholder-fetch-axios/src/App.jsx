import { useState } from "react";
import BuscadorUsuarios from "./components/BuscadorUsuarios.jsx";
import BlogPosts from "./components/BlogPosts.jsx";

function App() {
  const [vista, setVista] = useState("usuarios");

  return (
    <div className="min-vh-100 d-flex flex-column">
      <header className="cabecera-practica py-4">
        <div className="container">
          <p className="small fw-semibold mb-2">REACT · FETCH · AXIOS</p>
          <h1 className="h3 mb-2">Explorador de JSONPlaceholder</h1>
          <p className="mb-0">Carga, filtrado, detalle, comentarios y cancelación de solicitudes.</p>
        </div>
      </header>

      <main className="container py-4 flex-grow-1">
        <aside className="nota-aprendizaje mb-4">
          <strong>Chilete DevPath explica:</strong> la primera vista descarga usuarios una sola vez
          con <code>fetch</code> y filtra el arreglo con <code>useMemo</code>. La segunda configura
          un cliente Axios y encadena consultas de publicación y comentarios. Ambos flujos usan
          <code>AbortController</code> para cancelar trabajo cuando el componente deja de necesitarlo.
        </aside>

        <nav className="d-flex flex-wrap gap-2 mb-4" aria-label="Ejemplos de consumo de API">
          <button
            type="button"
            className={`btn ${vista === "usuarios" ? "btn-primary" : "btn-outline-primary"}`}
            onClick={() => setVista("usuarios")}
            aria-pressed={vista === "usuarios"}
          >
            Usuarios con fetch
          </button>
          <button
            type="button"
            className={`btn ${vista === "blog" ? "btn-primary" : "btn-outline-primary"}`}
            onClick={() => setVista("blog")}
            aria-pressed={vista === "blog"}
          >
            Blog con Axios
          </button>
        </nav>

        {vista === "usuarios" ? <BuscadorUsuarios /> : <BlogPosts />}
      </main>

      <footer className="pie-practica py-3 text-center small">
        Práctica educativa · Chilete DevPath
      </footer>
    </div>
  );
}

export default App;
