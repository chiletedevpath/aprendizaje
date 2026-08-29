case class Cliente(nombre: String)
case class DetallePedido(producto: String, cantidad: Int)
class Pedido(val cliente: Cliente):
  private var detalles = List.empty[DetallePedido]
  def agregar(producto: String, cantidad: Int): Unit = detalles ::= DetallePedido(producto, cantidad)
  def totalDetalles: Int = detalles.size

@main def retoPedido(): Unit =
  val p = new Pedido(Cliente("Cliente Chilete"))
  p.agregar("Cuaderno", 2)
  println(p.totalDetalles)
