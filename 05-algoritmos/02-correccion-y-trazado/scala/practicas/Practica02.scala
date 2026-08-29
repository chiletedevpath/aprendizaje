object Practica02:
  @main def ejecutar(): Unit =
    val datos = Array(4, 9, 2, 11, 6)
    var maximo = datos(0)
    for i <- 1 until datos.length do
      if datos(i) > maximo then maximo = datos(i)
      // maximo conserva el mayor valor procesado hasta esta posición.
      println(s"i=$i, maximo=$maximo")
