type Producto = readonly [nombre: string, stock: number, precioUnitario: number];

const productos: Producto[] = [
  ["Cuaderno", 12, 18.5],
  ["Teclado", 8, 120],
  ["Monitor", 4, 800],
];

const inventario = productos.map(([nombre, stock, precioUnitario]) => ({
  nombre,
  stock,
  precioUnitario,
  valor: stock * precioUnitario,
}));
const valorTotal = inventario.reduce((total, producto) => total + producto.valor, 0);

console.table(inventario);
console.log(`Valor total del inventario: S/ ${valorTotal.toFixed(2)}`);
