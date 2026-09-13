function calcularBoleta({ cliente, producto, cantidad, precioUnitario, tasaIgv }) {
  const subtotal = cantidad * precioUnitario;
  const igv = subtotal * tasaIgv;
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

function agregarDato(lista, etiqueta, valor) {
  const termino = document.createElement("dt");
  const descripcion = document.createElement("dd");

  termino.textContent = etiqueta;
  descripcion.textContent = valor;
  lista.append(termino, descripcion);
}

const moneda = new Intl.NumberFormat("es-PE", {
  style: "currency",
  currency: "PEN",
});

const boleta = calcularBoleta({
  cliente: "Elena Torres",
  producto: "Equipo de estudio",
  cantidad: 2,
  precioUnitario: 750,
  tasaIgv: 0.18,
});

const detalle = document.querySelector("#detalle-boleta");
agregarDato(detalle, "Cliente", boleta.cliente);
agregarDato(detalle, "Producto", boleta.producto);
agregarDato(detalle, "Cantidad", String(boleta.cantidad));
agregarDato(detalle, "Precio unitario", moneda.format(boleta.precioUnitario));
agregarDato(detalle, "Subtotal", moneda.format(boleta.subtotal));
agregarDato(detalle, "IGV", moneda.format(boleta.igv));
agregarDato(detalle, "Total", moneda.format(boleta.total));
agregarDato(detalle, "Tipo de cliente", boleta.tipoCliente);
