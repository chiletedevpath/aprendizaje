object TrazaMaximo:
  def maximo(datos: Array[Int]): Int =
    require(datos.nonEmpty, "El arreglo no puede estar vacío")
    var mayor = datos(0)
    for i <- 1 until datos.length do
      if datos(i) > mayor then mayor = datos(i)
      // mayor conserva el máximo observado hasta la posición actual.
      println(s"i=$i, mayor=$mayor")
    mayor

  @main def ejecutar(): Unit = println(maximo(Array(7, 3, 11, 5, 9)))
