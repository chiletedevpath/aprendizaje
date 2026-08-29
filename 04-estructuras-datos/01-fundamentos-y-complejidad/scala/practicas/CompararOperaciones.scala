object CompararOperaciones:
  def main(args: Array[String]): Unit =
    val datos = Vector(10, 20, 30, 40)
    // El índice accede a una posición concreta de Vector.
    println(datos(2))
    // contains expresa una búsqueda por valor dentro de la colección.
    println(datos.contains(40))
