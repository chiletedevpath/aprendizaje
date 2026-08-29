case class ProductoContrato(codigo: String, nombre: String)
@main def practicaProducto(): Unit = println(ProductoContrato("P1","Teclado")==ProductoContrato("P1","Teclado"))
