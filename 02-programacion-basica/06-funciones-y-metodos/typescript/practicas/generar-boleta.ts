interface Boleta {
  cliente: string;
  producto: string;
  cantidad: number;
  precioUnitario: number;
  subtotal: number;
  igv: number;
  total: number;
  tipoCliente: "Regular" | "Preferencial";
}

function calcularBoleta(
  cliente: string,
  producto: string,
  cantidad: number,
  precioUnitario: number,
): Boleta {
  const subtotal = cantidad * precioUnitario;
  const igv = subtotal * 0.18;
  const total = subtotal + igv;

  return {
    cliente,
    producto,
    cantidad,
    precioUnitario,
    subtotal,
    igv,
    total,
    tipoCliente: total > 1500 ? "Preferencial" : "Regular",
  };
}

console.table([calcularBoleta("Elena Torres", "Equipo de estudio", 2, 750)]);
