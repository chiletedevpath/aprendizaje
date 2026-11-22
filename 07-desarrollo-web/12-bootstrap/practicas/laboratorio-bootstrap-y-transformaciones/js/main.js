// El formulario es demostrativo: valida los campos, pero no envía datos.
const formulario = document.getElementById("formularioDemostrativo");
const respuesta = document.getElementById("respuestaFormulario");

formulario.addEventListener("submit", (evento) => {
  evento.preventDefault();
  respuesta.textContent = "Formulario de demostración: no se envió ningún mensaje.";
});

formulario.addEventListener("reset", () => {
  respuesta.textContent = "";
});

// Cierra el menú móvil después de elegir una sección.
document.querySelectorAll("#menuPrincipal .nav-link").forEach((enlace) => {
  enlace.addEventListener("click", () => {
    const menu = document.getElementById("menuPrincipal");
    if (menu.classList.contains("show") && window.bootstrap) {
      bootstrap.Collapse.getOrCreateInstance(menu).hide();
    }
  });
});
