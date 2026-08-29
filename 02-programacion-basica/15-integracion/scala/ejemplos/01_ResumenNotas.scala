def calcularPromedio(notas: List[Int]): Double =
  if notas.isEmpty then 0.0
  else
    // require rechaza datos que no cumplen la condición declarada.
    require(notas.forall(n => n >= 0 && n <= 20), "Nota fuera de rango")
    notas.sum.toDouble / notas.size

@main def resumenNotas(): Unit =
  val notas = List(15, 18, 11, 20)
  println(f"Promedio: ${calcularPromedio(notas)}%.2f")
