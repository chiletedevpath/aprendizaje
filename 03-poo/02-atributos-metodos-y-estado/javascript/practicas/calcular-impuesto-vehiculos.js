// Encapsula una regla tributaria por tramos dentro del objeto responsable.

class Vehiculo {
  constructor(marca, modelo, precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }

  calcularImpuesto() {
    const tasa = this.precio > 20000 ? 0.16 : 0.14;
    return this.precio * tasa;
  }
}

const vehiculos = [
  new Vehiculo("Marca Norte", "Sedán A", 18500),
  new Vehiculo("Marca Central", "SUV B", 25000),
  new Vehiculo("Marca Sur", "SUV C", 32000),
];

const resumen = vehiculos.map((vehiculo) => ({
  vehiculo: `${vehiculo.marca} ${vehiculo.modelo}`,
  precio: vehiculo.precio,
  impuesto: Number(vehiculo.calcularImpuesto().toFixed(2)),
}));

console.table(resumen);
