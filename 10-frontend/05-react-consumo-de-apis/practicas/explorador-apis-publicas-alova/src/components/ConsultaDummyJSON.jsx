import { useState } from "react";
import { useRequest } from "alova/client";
import { buscarUsuarioDummy } from "../services/apis";

function ConsultaDummyJSON() {
  const [usuario, setUsuario] = useState("emilys");
  const [resultado, setResultado] = useState(null);
  const [mensaje, setMensaje] = useState("");

  const { loading, send } = useRequest((nombre) => buscarUsuarioDummy(nombre), {
    immediate: false,
    force: true
  });

  const consultar = async (evento) => {
    evento.preventDefault();
    const nombre = usuario.trim();
    setResultado(null);
    setMensaje("");

    if (!nombre) {
      setMensaje("Escribe un nombre de usuario.");
      return;
    }

    try {
      const datos = await send(nombre);
      if (!datos?.users?.length) {
        setMensaje("El usuario no existe en los datos de prueba.");
        return;
      }
      setResultado(datos.users[0]);
    } catch (error) {
      setMensaje(error.message || "No se pudo consultar DummyJSON.");
    }
  };

  return (
    <section className="card mt-4" aria-labelledby="titulo-dummy">
      <div className="card-body">
        <h3 id="titulo-dummy" className="h5">
          Consulta de usuario de prueba (DummyJSON)
        </h3>
        <p className="text-secondary small">Esta API proporciona usuarios ficticios</p>
        <form onSubmit={consultar}>
          <label className="form-label" htmlFor="dummy-usuario">
            Nombre de usuario
          </label>
          <div className="d-flex gap-2 flex-wrap">
            <input
              id="dummy-usuario"
              className="form-control campo-usuario"
              value={usuario}
              onChange={(evento) => setUsuario(evento.target.value)}
              placeholder="Ejemplo: emilys"
              required
            />
            <button className="btn btn-outline-primary" type="submit" disabled={loading}>
              {loading ? "Consultando..." : "Consultar DummyJSON"}
            </button>
          </div>
        </form>
        {mensaje && (
          <p className="alert alert-warning mt-3 mb-0" role="alert">
            {mensaje}
          </p>
        )}
        {resultado && (
          <div className="border rounded p-3 mt-3">
            <p className="mb-1">
              <strong>Usuario:</strong> {resultado.username}
            </p>
            <p className="mb-1">
              <strong>Nombre:</strong> {resultado.firstName} {resultado.lastName}
            </p>
            <p className="mb-0">
              <strong>Correo:</strong> {resultado.email}
            </p>
          </div>
        )}
      </div>
    </section>
  );
}

export default ConsultaDummyJSON;
