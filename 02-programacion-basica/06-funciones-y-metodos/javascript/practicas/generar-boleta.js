// Calcula los importes y genera una boleta demostrativa.
function generarBoleta(cliente, producto, cantidad, precioUnitario) {
  const subtotal = cantidad * precioUnitario;
  const igv = subtotal * 0.18;
  const total = subtotal + igv;

  const boleta = `
BOLETA ELECTRÓNICA

Cliente: ${cliente}
Producto: ${producto}
Cantidad: ${cantidad}
Precio unitario: S/ ${precioUnitario.toFixed(2)}

Subtotal: S/ ${subtotal.toFixed(2)}
IGV (18%): S/ ${igv.toFixed(2)}
TOTAL A PAGAR: S/ ${total.toFixed(2)}

Tipo de cliente: ${total > 500 ? "Cliente preferencial" : "Cliente regular"}
`;

  console.log(boleta);
}

generarBoleta("Adrian Pisco", "Laptop", 1, 2800);
