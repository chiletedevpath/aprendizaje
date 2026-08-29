@main def retoCompraIgv(): Unit =
  // val mantiene referencias inmutables durante el cálculo.
  val precio = 25.0
  val cantidad = 3
  val igv = 0.18

  val subtotal = precio * cantidad
  val impuesto = subtotal * igv
  val total = subtotal + impuesto
  println(f"Subtotal: $subtotal%.2f | IGV: $impuesto%.2f | Total: $total%.2f")
