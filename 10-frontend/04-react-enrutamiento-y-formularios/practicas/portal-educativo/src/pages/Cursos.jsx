import { cursos } from "../data/datos";

function Cursos() {
  return (
    <section className="panel">
      <span className="indicador">Cursos</span>
      <h2>Cursos disponibles</h2>
      <p className="intro">Listado de asignaturas y docentes responsables.</p>
      <div className="tabla-desplazable">
        <table>
          <thead>
            <tr>
              <th scope="col">Código</th>
              <th scope="col">Curso</th>
              <th scope="col">Docente</th>
            </tr>
          </thead>
          <tbody>
            {cursos.map((curso) => (
              <tr key={curso.codigo}>
                <td className="codigo">{curso.codigo}</td>
                <td>{curso.nombre}</td>
                <td>{curso.docente}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
      <p className="nota">Los cursos y docentes se presentan como datos de ejemplo.</p>
    </section>
  );
}

export default Cursos;
