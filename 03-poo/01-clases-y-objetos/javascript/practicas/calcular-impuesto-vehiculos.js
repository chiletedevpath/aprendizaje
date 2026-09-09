// Modela vehículos como objetos y calcula un impuesto configurable.

class Vehiculo {
  constructor(marca, modelo, precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }
}

const vehiculos = [
  new Vehiculo("Marca Norte", "Sedán A", 65000),
  new Vehiculo("Marca Central", "Sedán B", 58000),
  new Vehiculo("Marca Sur", "Compacto C", 60000),
];

const tasaImpuesto = 0.18;
const vehiculosConImpuesto = vehiculos.map(({ marca, modelo, precio }) => ({
  marca,
  modelo,
  precio,
  impuesto: Number((precio * tasaImpuesto).toFixed(2)),
}));

console.table(vehiculosConImpuesto);
