object ArreglosYMatrices:
  def main(args: Array[String]): Unit =
    val notas = Array(12, 18, 15, 10)
    val promedio = notas.sum.toDouble / notas.length

    val matriz = Array(
      Array(1, 2),
      Array(3, 4)
    )

    println(s"Notas: ${notas.mkString("[", ", ", "]")}")
    println(s"Promedio: $promedio")
    println(s"Elemento fila 1, columna 0: ${matriz(1)(0)}")
