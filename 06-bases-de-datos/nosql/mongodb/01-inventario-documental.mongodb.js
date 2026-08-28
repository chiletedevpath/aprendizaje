// Laboratorio inicial de MongoDB.
// Contexto: inventario ficticio para practicar documentos, CRUD, indices y agregaciones.
// Ejecucion: mongosh "mongodb://localhost:27017" 01-inventario-documental.mongodb.js

const laboratorio = "inventario-documental-v1";
const base = db.getSiblingDB("chilete_aprendizaje");
const productos = base.getCollection("productos");

// La limpieza se limita a los documentos identificados por este laboratorio.
productos.deleteMany({ laboratorio });

productos.insertMany([
  {
    laboratorio,
    codigo: "ESC-001",
    nombre: "Cuaderno de practica",
    categoria: { codigo: "ESC", nombre: "Escritura" },
    precio: 12.5,
    stock: 20,
    etiquetas: ["estudio", "evidencia"],
    activo: true,
  },
  {
    laboratorio,
    codigo: "ORG-001",
    nombre: "Archivador de evidencias",
    categoria: { codigo: "ORG", nombre: "Organizacion" },
    precio: 18.9,
    stock: 8,
    etiquetas: ["organizacion"],
    activo: true,
  },
]);

productos.createIndex(
  { laboratorio: 1, codigo: 1 },
  {
    name: "uq_laboratorio_codigo",
    unique: true,
    partialFilterExpression: {
      laboratorio: { $type: "string" },
      codigo: { $type: "string" },
    },
  },
);

productos.updateOne(
  { laboratorio, codigo: "ESC-001", stock: { $gte: 2 } },
  { $inc: { stock: -2 }, $set: { actualizadoEn: new Date() } },
);

productos
  .find(
    { laboratorio, activo: true },
    { _id: 0, codigo: 1, nombre: 1, "categoria.nombre": 1, precio: 1, stock: 1 },
  )
  .sort({ codigo: 1 });

productos.aggregate([
  { $match: { laboratorio, activo: true } },
  {
    $group: {
      _id: "$categoria.nombre",
      productos: { $sum: 1 },
      unidades: { $sum: "$stock" },
      valorInventario: { $sum: { $multiply: ["$precio", "$stock"] } },
    },
  },
  { $sort: { _id: 1 } },
]);
