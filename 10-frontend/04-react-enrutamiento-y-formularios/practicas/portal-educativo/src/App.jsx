import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./components/Header";
import Menu from "./components/Menu";
import Footer from "./components/Footer";
import Inicio from "./pages/Inicio";
import Estudiantes from "./pages/Estudiantes";
import Cursos from "./pages/Cursos";
import Contacto from "./pages/Contacto";

function App() {
  return (
    <BrowserRouter>
      <div className="aplicacion">
        <Header />
        <Menu />
        <main className="contenedor contenido">
          <aside className="nota-aprendizaje">
            <strong>Chilete DevPath explica:</strong> <code>Routes</code> relaciona cada URL con un
            componente y <code>NavLink</code> identifica el enlace activo. Las páginas comparten
            cabecera, menú y pie sin recargar el documento. Observa también el uso de propiedades,
            <code>map</code> y un formulario controlado por estado.
          </aside>
          <Routes>
            <Route path="/" element={<Inicio />} />
            <Route path="/estudiantes" element={<Estudiantes />} />
            <Route path="/cursos" element={<Cursos />} />
            <Route path="/contacto" element={<Contacto />} />
            <Route
              path="*"
              element={
                <section className="panel">
                  <h2>Página no encontrada</h2>
                  <p>Selecciona una opción del menú para continuar.</p>
                </section>
              }
            />
          </Routes>
        </main>
        <Footer />
      </div>
    </BrowserRouter>
  );
}

export default App;
