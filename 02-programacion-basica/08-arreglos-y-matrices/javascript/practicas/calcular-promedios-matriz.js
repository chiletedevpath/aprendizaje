// Calcula el promedio de cada fila de una matriz de calificaciones.

const calificaciones = [
  [15, 18, 14, 16],
  [12, 14, 13, 15],
  [18, 17, 19, 16],
];

calificaciones.forEach((notas, indice) => {
  const suma = notas.reduce((acumulado, nota) => acumulado + nota, 0);
  const promedio = notas.length === 0 ? 0 : suma / notas.length;

  console.log(`Estudiante ${indice + 1} - Promedio: ${promedio.toFixed(2)}`);
});
