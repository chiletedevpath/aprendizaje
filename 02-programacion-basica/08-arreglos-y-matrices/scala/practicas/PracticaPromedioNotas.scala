@main def practicaPromedioNotas(): Unit =
  val notas = Array(14, 18, 11, 16, 20)
  // sum acumula los elementos y toDouble evita división entera.
  val promedio = notas.sum.toDouble / notas.length
  println(f"Promedio: $promedio%.2f")
