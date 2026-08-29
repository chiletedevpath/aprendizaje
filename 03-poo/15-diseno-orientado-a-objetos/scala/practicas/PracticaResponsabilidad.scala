class CalculadoraPrecio:
  def total(precio: Double,cantidad:Int): Double = precio*cantidad
class PresentadorTotal:
  def mostrar(total: Double): Unit = println(f"Total: $total%.2f")
@main def practicaResponsabilidad(): Unit = new PresentadorTotal().mostrar(new CalculadoraPrecio().total(20,3))
