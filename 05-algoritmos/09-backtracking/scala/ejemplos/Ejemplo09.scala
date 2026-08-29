object SubconjuntosBacktracking:
  def generar(datos: List[Int], actual: List[Int] = Nil): Unit = datos match
    case Nil => println(actual.reverse)
    case x :: xs =>
      generar(xs, x :: actual)
      // La segunda rama explora la alternativa de no incluir el elemento.
      generar(xs, actual)
  @main def ejecutar(): Unit = generar(List(1,2,3))
