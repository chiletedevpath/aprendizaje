@main def ejemploArray(): Unit =
  val notas = Array(15, 18, 12, 20)

  // indices devuelve el rango válido de posiciones del arreglo.
  for i <- notas.indices do
    println(s"notas[$i] = ${notas(i)}")
