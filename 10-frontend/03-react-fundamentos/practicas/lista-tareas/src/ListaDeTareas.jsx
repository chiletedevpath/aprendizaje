import { useState } from "react";

function ListaDeTareas() {
  const [tareas, setTareas] = useState([
    { id: "jsx", texto: "Reconocer JSX y componentes", completada: true },
    { id: "estado", texto: "Practicar actualizaciones inmutables", completada: false }
  ]);
  const [nuevaTarea, setNuevaTarea] = useState("");

  const agregarTarea = (evento) => {
    evento.preventDefault();
    const texto = nuevaTarea.trim();
    if (!texto) return;

    setTareas((anteriores) => [
      ...anteriores,
      { id: crypto.randomUUID(), texto, completada: false }
    ]);
    setNuevaTarea("");
  };

  const alternarTarea = (id) => {
    setTareas((anteriores) =>
      anteriores.map((tarea) =>
        tarea.id === id ? { ...tarea, completada: !tarea.completada } : tarea
      )
    );
  };

  const eliminarTarea = (id) => {
    setTareas((anteriores) => anteriores.filter((tarea) => tarea.id !== id));
  };

  const pendientes = tareas.filter((tarea) => !tarea.completada).length;

  return (
    <div className="pagina">
      <header className="encabezado">
        <p className="etiqueta">REACT · FUNDAMENTOS</p>
        <h1>Lista de tareas</h1>
        <p>Estado, eventos, formularios controlados y renderizado de colecciones.</p>
      </header>

      <main className="contenido">
        <aside className="nota-aprendizaje">
          <strong>Chilete DevPath explica:</strong> el arreglo de tareas vive en el estado.
          Cada acción crea un nuevo arreglo con <code>map</code>, <code>filter</code> o el operador
          de propagación; React compara el estado y vuelve a renderizar la lista. Observa que la
          cantidad pendiente se calcula a partir de las tareas y no se guarda como otro estado.
        </aside>

        <section className="panel" aria-labelledby="titulo-panel">
          <div className="cabecera-panel">
            <div>
              <h2 id="titulo-panel">Tareas de aprendizaje</h2>
              <p>{pendientes} pendiente{pendientes === 1 ? "" : "s"}</p>
            </div>
            <span>{tareas.length} total</span>
          </div>

          <form className="formulario" onSubmit={agregarTarea}>
            <label htmlFor="nueva-tarea">Nueva tarea</label>
            <div className="fila-formulario">
              <input
                id="nueva-tarea"
                value={nuevaTarea}
                onChange={(evento) => setNuevaTarea(evento.target.value)}
                placeholder="Ej. Practicar propiedades"
                maxLength="80"
                required
              />
              <button type="submit" disabled={!nuevaTarea.trim()}>Agregar</button>
            </div>
          </form>

          {tareas.length === 0 ? (
            <p className="vacio" role="status">No hay tareas. Agrega una para comenzar.</p>
          ) : (
            <ul className="lista">
              {tareas.map((tarea) => (
                <li key={tarea.id} className={tarea.completada ? "completada" : ""}>
                  <label>
                    <input
                      type="checkbox"
                      checked={tarea.completada}
                      onChange={() => alternarTarea(tarea.id)}
                    />
                    <span>{tarea.texto}</span>
                  </label>
                  <button className="eliminar" type="button" onClick={() => eliminarTarea(tarea.id)}>
                    Eliminar
                  </button>
                </li>
              ))}
            </ul>
          )}
        </section>
      </main>

      <footer>Práctica educativa · Chilete DevPath</footer>
    </div>
  );
}

export default ListaDeTareas;
