object ComplejidadLineal:
  def contiene(datos: Array[Int], buscado: Int): Boolean =
    // exists recorre hasta encontrar una coincidencia o terminar la colección.
    datos.exists(_ == buscado)

  @main def ejecutar(): Unit = println(contiene(Array(4, 8, 15, 16, 23, 42), 23))
