import { useState } from "react";

function Contacto() {
  const [nombre, setNombre] = useState("");
  const [mensaje, setMensaje] = useState("");

  const enviar = (evento) => {
    evento.preventDefault();
    const nombreNormalizado = nombre.trim();
    if (!nombreNormalizado) return;

    setMensaje(`Gracias, ${nombreNormalizado}. Este formulario es una demostración y no envió datos.`);
    setNombre("");
  };

  return (
    <section className="panel">
      <span className="indicador">Formulario</span>
      <h2>Formulario controlado</h2>
      <p className="intro">
        El valor del campo permanece en el estado y cambia con cada evento <code>onChange</code>.
      </p>
      <form className="formulario-contacto" onSubmit={enviar}>
        <label htmlFor="nombre-contacto">Nombre</label>
        <input
          id="nombre-contacto"
          value={nombre}
          onChange={(evento) => setNombre(evento.target.value)}
          placeholder="Escribe un nombre"
          maxLength="70"
          required
        />
        <button type="submit" disabled={!nombre.trim()}>Enviar demostración</button>
      </form>
      {mensaje && <p className="respuesta" role="status">{mensaje}</p>}
    </section>
  );
}

export default Contacto;
