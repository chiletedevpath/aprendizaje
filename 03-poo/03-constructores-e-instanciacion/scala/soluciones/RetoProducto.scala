class ProductoReto(val nombre: String, val precio: Double):
  require(precio >= 0, "El precio no puede ser negativo")
  def ficha: String = s"$nombre - S/ $precio"

@main def retoProducto(): Unit = println(new ProductoReto("Teclado", 80).ficha)
