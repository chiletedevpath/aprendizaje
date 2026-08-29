def calcularSubtotal(precio: Double, cantidad: Int): Double = precio * cantidad

def aplicarDescuento(subtotal: Double, tasa: Double): Double =
  subtotal * (1 - tasa)

def mostrarResultado(subtotal: Double, total: Double): Unit =
  // Cada función concentra una responsabilidad concreta.
  println(f"Subtotal: $subtotal%.2f | Total: $total%.2f")

@main def separarResponsabilidades(): Unit =
  val subtotal = calcularSubtotal(15.0, 3)
  val total = aplicarDescuento(subtotal, 0.10)
  mostrarResultado(subtotal, total)
