import { Link } from "react-router-dom";
import Saludo from "../components/Saludo";

function Inicio() {
  return (
    <section className="panel panel-inicio">
      <span className="indicador">Inicio</span>
      <h2>Bienvenido al Portal Académico</h2>
      <p>
        Este espacio reúne información básica de los estudiantes, los cursos disponibles y los
        canales de contacto de la universidad.
      </p>
      <Saludo nombre="estudiante" />
      <div className="resumen">
        <article className="resumen-item">
          <h3>Estudiantes</h3>
          <p>Consulta los códigos, nombres y apellidos registrados.</p>
          <Link to="/estudiantes">Ver estudiantes</Link>
        </article>
        <article className="resumen-item">
          <h3>Cursos</h3>
          <p>Revisa la relación de cursos y docentes a cargo.</p>
          <Link to="/cursos">Ver cursos</Link>
        </article>
      </div>
    </section>
  );
}

export default Inicio;
