"use strict";

// Menú: alterna .active y sincroniza sus atributos de accesibilidad.
const menuToggle = document.getElementById("menuToggle");
const menuItems = document.getElementById("menuItems");

function cerrarMenu() {
  menuItems.classList.remove("active");
  menuToggle.setAttribute("aria-expanded", "false");
  menuToggle.setAttribute("aria-label", "Abrir menú");
}

menuToggle.addEventListener("click", () => {
  const abierto = menuItems.classList.toggle("active");
  menuToggle.setAttribute("aria-expanded", String(abierto));
  menuToggle.setAttribute("aria-label", abierto ? "Cerrar menú" : "Abrir menú");
});
menuItems.querySelectorAll("a").forEach((enlace) => enlace.addEventListener("click", cerrarMenu));
document.addEventListener("keydown", (event) => {
  if (event.key === "Escape" && menuItems.classList.contains("active")) {
    cerrarMenu();
    menuToggle.focus();
  }
});
document.addEventListener("click", (event) => {
  if (!menuToggle.contains(event.target) && !menuItems.contains(event.target)) cerrarMenu();
});

// Ripple: crea la onda en el punto del clic; CSS anima su expansión.
const rippleButton = document.getElementById("rippleButton");
const estadoRipple = document.getElementById("estadoRipple");
let activaciones = 0;

// Respeta el movimiento reducido, con activación opcional desde la página.
const preferenciasMovimiento = window.matchMedia("(prefers-reduced-motion: reduce)");
const textoMovimiento = document.getElementById("mensajeAnimaciones");
const botonMovimiento = document.getElementById("activarAnimaciones");
const estadoMovimiento = document.querySelector(".estado-animaciones");
const animacionesHabilitadas = () =>
  !preferenciasMovimiento.matches ||
  document.documentElement.classList.contains("demostracion-activa");

function actualizarEstadoMovimiento() {
  const reducido = !animacionesHabilitadas();
  textoMovimiento.textContent = "El movimiento está reducido en este dispositivo.";
  estadoMovimiento.hidden = !reducido;
  botonMovimiento.hidden = !reducido;
  estadoMovimiento.classList.toggle("reducidas", reducido);
}

botonMovimiento.addEventListener("click", () => {
  document.documentElement.classList.add("demostracion-activa");
  actualizarEstadoMovimiento();
});
preferenciasMovimiento.addEventListener?.("change", actualizarEstadoMovimiento);
actualizarEstadoMovimiento();

rippleButton.addEventListener("click", (event) => {
  const rect = rippleButton.getBoundingClientRect();
  const diametro = 100;
  // getBoundingClientRect() evita errores al desplazar la página.
  const x = event.detail === 0 ? rect.width / 2 : event.clientX - rect.left;
  const y = event.detail === 0 ? rect.height / 2 : event.clientY - rect.top;

  const circulo = document.createElement("span");
  circulo.classList.add("ripple");
  circulo.style.left = `${x - diametro / 2}px`;
  circulo.style.top = `${y - diametro / 2}px`;
  rippleButton.appendChild(circulo);
  // Se elimina el elemento temporal para que no se acumulen círculos.
  circulo.addEventListener("animationend", () => circulo.remove(), { once: true });
  if (!animacionesHabilitadas()) circulo.remove();
  activaciones++;
  estadoRipple.textContent = `Pulsaciones: ${activaciones}`;
});

// El indicador de carga se anima únicamente desde CSS.

// Alternativa para scroll si animation-timeline no está disponible.
const soportaScrollCSS =
  CSS.supports("animation-timeline: view()") &&
  CSS.supports("animation-range: entry 25% cover 30%");
if (!soportaScrollCSS && "IntersectionObserver" in window) {
  document.documentElement.classList.add("no-scroll-timeline");
  const observador = new IntersectionObserver(
    (entradas) => {
      entradas.forEach((entrada) => {
        if (entrada.isIntersecting) {
          entrada.target.classList.add("visible");
          observador.unobserve(entrada.target);
        }
      });
    },
    { threshold: 0.2 }
  );
  document.querySelectorAll(".imagen-scroll").forEach((imagen) => observador.observe(imagen));
}
