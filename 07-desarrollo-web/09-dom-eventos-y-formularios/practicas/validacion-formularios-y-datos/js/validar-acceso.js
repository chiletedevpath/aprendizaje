const formularioAcceso = document.querySelector("#form-acceso");
const resultadoAcceso = document.querySelector("#resultado-acceso");

formularioAcceso.addEventListener("submit", (evento) => {
  evento.preventDefault();

  const correo = document.querySelector("#correo").value.trim().toLowerCase();
  const formatoValido = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(correo);
  const dominioPermitido = correo.endsWith("@aula.example");
  const accesoValido = formatoValido && dominioPermitido;

  resultadoAcceso.className = `resultado ${accesoValido ? "correcto" : "error"}`;
  resultadoAcceso.replaceChildren();

  const titulo = document.createElement("strong");
  titulo.textContent = accesoValido ? "Validación correcta" : "Validación no superada";

  const detalle = document.createElement("p");
  detalle.textContent = `Formato: ${formatoValido ? "válido" : "inválido"}. Dominio permitido: ${dominioPermitido ? "sí" : "no"}.`;

  resultadoAcceso.append(titulo, detalle);
});
