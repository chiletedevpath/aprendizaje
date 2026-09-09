// Filtra estudiantes aprobados y transforma el resultado en una lista de nombres.

const estudiantes = [
  { nombre: "Elena", notaFinal: 18 },
  { nombre: "Marco", notaFinal: 10 },
  { nombre: "Lucía", notaFinal: 15 },
  { nombre: "Pedro", notaFinal: 11 },
];

const nombresAprobados = estudiantes
  .filter(({ notaFinal }) => notaFinal >= 12)
  .map(({ nombre }) => nombre);

console.log("Estudiantes aprobados:", nombresAprobados);
