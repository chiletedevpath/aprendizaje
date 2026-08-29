// Lista de productos con nombre y precio
const productos = [
  { nombre: "Manzanas", precio: 3 },
  { nombre: "Peras", precio: 12 },
  { nombre: "Sandías", precio: 100 },
  { nombre: "Kiwi", precio: 7 }
];

// Recorrer cada producto del arreglo
productos.forEach((producto) => {
  // Alinear el nombre a la izquierda
  const nombre = producto.nombre.padEnd(15);

  // Convertir el precio a texto y alinearlo a la derecha
  const precio = producto.precio.toString().padStart(5);

  // Mostrar cada fila en consola
  console.log(nombre + precio);
});
