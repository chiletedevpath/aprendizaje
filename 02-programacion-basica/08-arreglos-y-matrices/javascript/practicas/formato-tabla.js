const productos = [
  { nombre: "Manzanas", precio: 3 },
  { nombre: "Peras", precio: 12 },
  { nombre: "Sandías", precio: 100 },
  { nombre: "Kiwi", precio: 7 }
];

productos.forEach((producto) => {
  const nombre = producto.nombre.padEnd(15);
  const precio = producto.precio.toString().padStart(5);
  console.log(nombre + precio);
});
