import { useEffect, useMemo, useState } from "react";
import { API_URL } from "../services/api.js";
import { filtrarUsuarios } from "../utils/filtros.js";

function BuscadorUsuarios() {
  const [busqueda, setBusqueda] = useState("");
  const [usuarios, setUsuarios] = useState([]);
  const [cargando, setCargando] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const controlador = new AbortController();

    const cargarUsuarios = async () => {
      setCargando(true);
      setError("");

      try {
        const respuesta = await fetch(`${API_URL}/users`, {
          signal: controlador.signal,
        });

        if (!respuesta.ok) {
          throw new Error("No se pudieron consultar los usuarios.");
        }

        const datos = await respuesta.json();
        if (!controlador.signal.aborted) setUsuarios(datos);
      } catch {
        if (!controlador.signal.aborted) {
          setError("No se pudo cargar la lista de usuarios. Revisa tu conexión.");
          setUsuarios([]);
        }
      } finally {
        if (!controlador.signal.aborted) setCargando(false);
      }
    };

    cargarUsuarios();
    return () => {
      controlador.abort();
    };
  }, []);

  const resultados = useMemo(
    () => filtrarUsuarios(usuarios, busqueda),
    [usuarios, busqueda]
  );

  return (
    <section aria-labelledby="titulo-usuarios">
      <h2 id="titulo-usuarios" className="h4">Buscador de usuarios</h2>
      <p className="text-secondary">
        La lista se descarga una vez con <code>fetch</code> y se filtra localmente mientras escribes.
      </p>

      <div className="mb-3">
        <label className="form-label" htmlFor="buscar-usuario">Nombre, usuario o correo</label>
        <input
          id="buscar-usuario"
          type="search"
          className="form-control"
          placeholder="Ejemplo: Leanne o Bret"
          value={busqueda}
          onChange={(evento) => setBusqueda(evento.target.value)}
          autoComplete="off"
        />
      </div>

      {cargando && <p className="text-secondary" role="status">Consultando usuarios...</p>}
      {error && <div className="alert alert-danger" role="alert">{error}</div>}

      {!error && (
        <>
          <p className="small text-secondary" aria-live="polite">
            {resultados.length} usuario(s) encontrados
          </p>

          {resultados.length > 0 ? (
            <div className="table-responsive">
              <table className="table table-bordered table-striped align-middle">
                <thead className="table-light">
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Usuario</th>
                    <th scope="col">Correo</th>
                  </tr>
                </thead>
                <tbody>
                  {resultados.map((usuario) => (
                    <tr key={usuario.id}>
                      <td>{usuario.id}</td>
                      <td>{usuario.name}</td>
                      <td>{usuario.username}</td>
                      <td>{usuario.email}</td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          ) : !cargando && (
            <div className="alert alert-secondary" role="status">
              No se encontraron usuarios con ese criterio.
            </div>
          )}
        </>
      )}
    </section>
  );
}

export default BuscadorUsuarios;
