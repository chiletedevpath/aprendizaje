// Modela productos como objetos y genera una vista con el precio descontado.

class Producto {
  constructor(nombre, precio) {
    this.nombre = nombre;
    this.precio = precio;
  }
}

const productos = [
  new Producto("Laptop", 2500),
  new Producto("Mouse", 80),
  new Producto("Teclado", 150),
];

const tasaDescuento = 0.1;
const productosConDescuento = productos.map(({ nombre, precio }) => ({
  nombre,
  precioOriginal: precio,
  precioFinal: Number((precio * (1 - tasaDescuento)).toFixed(2)),
}));

console.table(productosConDescuento);
