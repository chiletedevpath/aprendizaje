// Práctica: modela cursos con recursos embebidos y etiquetas.
const base = db.getSiblingDB("chilete_practica");
const cursos = base.getCollection("cursos");

// Usa datos ficticios y limita la limpieza a esta práctica.
cursos.deleteMany({ practica: "cursos-v1" });

cursos.insertMany([
  { practica: "cursos-v1", codigo: "DB-01", titulo: "Bases de datos", categoria: "datos", recursos: [{ tipo: "guia", titulo: "Modelado ER" }], activo: true },
  { practica: "cursos-v1", codigo: "ALG-01", titulo: "Algoritmos", categoria: "programacion", recursos: [], activo: true }
]);

cursos.find({ practica: "cursos-v1", activo: true }, { _id: 0, codigo: 1, titulo: 1, categoria: 1 });
