def subtotal(precio: Double, cantidad: Int): Double = precio * cantidad
def descuento(subtotal: Double): Double = if subtotal >= 100 then subtotal * 0.10 else 0.0

def mostrar(subtotal: Double, descuento: Double, total: Double): Unit =
  // Presentar resultados queda separado de las reglas de cálculo.
  println(f"Subtotal: $subtotal%.2f | Descuento: $descuento%.2f | Total: $total%.2f")

@main def retoBoletaModular(): Unit =
  val sub = subtotal(25.0, 4)
  val desc = descuento(sub)
  mostrar(sub, desc, sub - desc)
