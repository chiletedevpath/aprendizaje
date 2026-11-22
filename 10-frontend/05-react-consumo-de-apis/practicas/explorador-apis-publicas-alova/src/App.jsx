import { useState } from "react";
import ConsultaRepositorios from "./components/ConsultaRepositorios";
import ConsultaDummyJSON from "./components/ConsultaDummyJSON";

function App() {
  const [seccion, setSeccion] = useState("github");

  return (
    <div className="min-vh-100 d-flex flex-column">
      <header className="cabecera-practica py-4">
        <div className="container">
          <p className="small fw-semibold mb-2">REACT · ALOVA · APIS PÚBLICAS</p>
          <h1 className="h3 mb-2">Explorador de APIs públicas</h1>
          <p className="mb-0">Solicitudes bajo demanda, paginación, detalle y estados de interfaz.</p>
        </div>
      </header>

      <main className="container py-4 flex-grow-1">
        <aside className="nota-aprendizaje mb-4">
          <strong>Chilete DevPath explica:</strong> cada API tiene su propio cliente y URL base.
          <code>useRequest</code> entrega el estado de carga y <code>send()</code> ejecuta la consulta
          después de validar la entrada. La interfaz diferencia resultados, listas vacías, límites
          temporales y errores de red.
        </aside>

        <nav aria-label="Fuentes de datos" className="d-flex flex-wrap gap-2 mb-4">
          <button
            type="button"
            className={`btn ${seccion === "github" ? "btn-primary" : "btn-outline-primary"}`}
            onClick={() => setSeccion("github")}
            aria-pressed={seccion === "github"}
          >
            Repositorios de GitHub
          </button>
          <button
            type="button"
            className={`btn ${seccion === "dummy" ? "btn-primary" : "btn-outline-primary"}`}
            onClick={() => setSeccion("dummy")}
            aria-pressed={seccion === "dummy"}
          >
            Usuarios ficticios
          </button>
        </nav>

        {seccion === "github" ? <ConsultaRepositorios /> : <ConsultaDummyJSON />}
      </main>

      <footer className="pie-practica py-3 text-center small">
        Práctica educativa · Chilete DevPath
      </footer>
    </div>
  );
}

export default App;
