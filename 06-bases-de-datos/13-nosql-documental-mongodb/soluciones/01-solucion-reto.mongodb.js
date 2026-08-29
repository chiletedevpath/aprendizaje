// Solución de referencia del reto documental.
const base = db.getSiblingDB("chilete_reto");
const cursos = base.getCollection("cursos");

cursos.deleteMany({ practica: "reto-cursos-v1" });

cursos.insertMany([
  {
    practica: "reto-cursos-v1",
    codigo: "DB-01",
    titulo: "Bases de datos",
    categoria: "datos",
    recursos: [{ tipo: "guia", titulo: "Modelado relacional" }],
    etiquetas: ["sql", "modelado"],
    activo: true,
  },
  {
    practica: "reto-cursos-v1",
    codigo: "WEB-01",
    titulo: "Desarrollo web",
    categoria: "web",
    recursos: [{ tipo: "practica", titulo: "Página accesible" }],
    etiquetas: ["html", "css"],
    activo: true,
  },
]);

cursos.createIndex({ categoria: 1, activo: 1 });

cursos.aggregate([
  { $match: { practica: "reto-cursos-v1", activo: true } },
  { $group: { _id: "$categoria", total: { $sum: 1 } } },
  { $sort: { _id: 1 } }
]);
