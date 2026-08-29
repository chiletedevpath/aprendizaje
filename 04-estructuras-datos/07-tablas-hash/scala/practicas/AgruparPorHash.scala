object AgruparPorHash:
  def main(args: Array[String]): Unit =
    val claves = List(1, 6, 11, 2)
    // El módulo simula una función hash pequeña para observar colisiones.
    val cubetas = claves.groupBy(_ % 5)
    println(cubetas)
