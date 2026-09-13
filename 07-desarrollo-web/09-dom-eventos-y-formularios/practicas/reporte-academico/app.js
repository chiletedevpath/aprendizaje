class Estudiante {
  constructor(codigo, nombre, cursos) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.cursos = [...cursos];
  }

  calcularPromedio() {
    if (this.cursos.length === 0) {
      return 0;
    }

    const suma = this.cursos.reduce((total, curso) => total + curso.nota, 0);
    return suma / this.cursos.length;
  }
}

const estudiantes = [
  new Estudiante("E-001", "Elena Torres", [
    { nombre: "JavaScript", nota: 18 },
    { nombre: "Desarrollo web", nota: 16 },
    { nombre: "Arquitectura de software", nota: 17 },
  ]),
  new Estudiante("E-002", "Marco Díaz", [
    { nombre: "JavaScript", nota: 12 },
    { nombre: "Desarrollo web", nota: 13 },
    { nombre: "Arquitectura de software", nota: 14 },
  ]),
  new Estudiante("E-003", "Lucía Rojas", [
    { nombre: "JavaScript", nota: 15 },
    { nombre: "Desarrollo web", nota: 14 },
    { nombre: "Arquitectura de software", nota: 16 },
  ]),
];

function crearReporte(estudiante) {
  const promedio = estudiante.calcularPromedio();
  const articulo = document.createElement("article");
  const titulo = document.createElement("h2");
  const datos = document.createElement("p");
  const lista = document.createElement("ul");

  titulo.textContent = estudiante.nombre;
  datos.textContent =
    `Código: ${estudiante.codigo} | Promedio: ${promedio.toFixed(2)} | ` +
    `Estado: ${promedio >= 14 ? "Aprobado" : "Desaprobado"}`;

  estudiante.cursos.forEach((curso) => {
    const elemento = document.createElement("li");
    elemento.textContent = `${curso.nombre}: ${curso.nota}`;
    lista.append(elemento);
  });

  articulo.append(titulo, datos, lista);
  return articulo;
}

const resultados = document.querySelector("#resultados");
estudiantes.forEach((estudiante) => resultados.append(crearReporte(estudiante)));
