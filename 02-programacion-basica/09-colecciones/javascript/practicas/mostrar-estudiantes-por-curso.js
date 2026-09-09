// Recorre una colección bidimensional de cursos y estudiantes.

const cursos = [
  {
    nombre: "JavaScript",
    estudiantes: [
      { nombre: "Elena", nota: 18 },
      { nombre: "Marco", nota: 15 },
      { nombre: "Lucía", nota: 17 },
    ],
  },
  {
    nombre: "Bases de datos",
    estudiantes: [
      { nombre: "Elena", nota: 16 },
      { nombre: "Marco", nota: 14 },
      { nombre: "Lucía", nota: 19 },
    ],
  },
  {
    nombre: "Redes",
    estudiantes: [
      { nombre: "Elena", nota: 17 },
      { nombre: "Marco", nota: 13 },
      { nombre: "Lucía", nota: 18 },
    ],
  },
];

cursos.forEach(({ nombre, estudiantes }) => {
  console.log(`\nCurso: ${nombre}`);
  estudiantes.forEach((estudiante) => {
    console.log(`Nombre: ${estudiante.nombre} | Nota: ${estudiante.nota}`);
  });
});
