// getSiblingDB selecciona una base sin depender de la base activa en la sesión.
const base = db.getSiblingDB("chilete_devpath");
const cursos = base.getCollection("cursos");

// El documento embebe etiquetas porque se consultan junto con el curso.
cursos.insertOne({
  codigo: "JAVA-01",
  titulo: "Programación básica",
  categoria: "programacion",
  etiquetas: ["java", "fundamentos"],
  activo: true,
  progresoReferencia: 0
});

// El índice compuesto favorece filtros por estado y categoría.
cursos.createIndex({ activo: 1, categoria: 1 });

cursos.find(
  { activo: true, categoria: "programacion" },
  { _id: 0, codigo: 1, titulo: 1, etiquetas: 1 }
);

cursos.aggregate([
  { $match: { activo: true } },
  { $group: { _id: "$categoria", cursos: { $sum: 1 } } },
  { $sort: { cursos: -1 } }
]);
