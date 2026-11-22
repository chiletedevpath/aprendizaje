const formularioEstudiante = document.querySelector("#form-estudiante");
const resultadoEstudiante = document.querySelector("#resultado-estudiante");

formularioEstudiante.addEventListener("submit", (evento) => {
  evento.preventDefault();

  const nombre = document.querySelector("#nombre").value.trim().replace(/\s+/g, " ");
  const edadTexto = document.querySelector("#edad").value.trim();
  const edad = Number(edadTexto);
  const datosValidos =
    nombre.length > 0 && edadTexto !== "" && Number.isInteger(edad) && edad >= 1 && edad <= 120;

  resultadoEstudiante.className = `resultado ${datosValidos ? "correcto" : "error"}`;
  resultadoEstudiante.replaceChildren();

  const mensaje = document.createElement("p");
  mensaje.textContent = datosValidos
    ? `Hola, ${nombre.toLocaleUpperCase("es-PE")}. Tienes ${edad} años.`
    : "Ingresa un nombre y una edad válida entre 1 y 120 años.";

  resultadoEstudiante.append(mensaje);
});
