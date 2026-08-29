@main def retoAnalizarNotas(): Unit =
  val notas = Array(15, 18, 9, 20, 12)
  val promedio = notas.sum.toDouble / notas.length
  val mayor = notas.max
  val menor = notas.min
  // count calcula cuántos elementos satisfacen la condición.
  val aprobados = notas.count(_ >= 11)
  println(f"Promedio: $promedio%.2f | Mayor: $mayor | Menor: $menor | Aprobados: $aprobados")
