import { estudiantes } from "../data/datos";

function Estudiantes() {
  return (
    <section className="panel">
      <span className="indicador">Estudiantes</span>
      <h2>Relación de estudiantes</h2>
      <p className="intro">Consulta de códigos y datos de identificación de los estudiantes.</p>
      <div className="tabla-desplazable">
        <table>
          <thead>
            <tr>
              <th scope="col">Código</th>
              <th scope="col">Nombres</th>
              <th scope="col">Apellidos</th>
            </tr>
          </thead>
          <tbody>
            {estudiantes.map((estudiante) => (
              <tr key={estudiante.codigo}>
                <td className="codigo">{estudiante.codigo}</td>
                <td>{estudiante.nombres}</td>
                <td>{estudiante.apellidos}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </section>
  );
}

export default Estudiantes;
