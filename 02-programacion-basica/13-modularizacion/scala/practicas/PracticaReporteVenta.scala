def subtotalVenta(precio: Double, cantidad: Int): Double = precio * cantidad
def igvVenta(subtotal: Double): Double = subtotal * 0.18

def reporteVenta(subtotal: Double, igv: Double): String =
  // Formatear queda separado del cálculo para que ambas responsabilidades puedan cambiar de forma independiente.
  f"Subtotal: $subtotal%.2f | IGV: $igv%.2f | Total: ${subtotal + igv}%.2f"

@main def practicaReporteVenta(): Unit =
  val subtotal = subtotalVenta(12.5, 4)
  println(reporteVenta(subtotal, igvVenta(subtotal)))
