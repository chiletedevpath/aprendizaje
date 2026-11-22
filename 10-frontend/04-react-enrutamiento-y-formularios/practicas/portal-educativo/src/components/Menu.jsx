import { NavLink } from "react-router-dom";

const enlaces = [
  { ruta: "/", etiqueta: "Inicio" },
  { ruta: "/estudiantes", etiqueta: "Estudiantes" },
  { ruta: "/cursos", etiqueta: "Cursos" },
  { ruta: "/contacto", etiqueta: "Contacto" },
];

function Menu() {
  return (
    <nav className="barra-navegacion" aria-label="Navegación principal">
      <div className="contenedor enlaces">
        {enlaces.map((enlace) => (
          <NavLink
            key={enlace.ruta}
            to={enlace.ruta}
            end={enlace.ruta === "/"}
            className={({ isActive }) => `enlace ${isActive ? "activo" : ""}`}
          >
            {enlace.etiqueta}
          </NavLink>
        ))}
      </div>
    </nav>
  );
}

export default Menu;
