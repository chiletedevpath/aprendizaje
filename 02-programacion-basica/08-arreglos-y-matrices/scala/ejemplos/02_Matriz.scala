@main def ejemploMatriz(): Unit =
  val matriz = Array(Array(1, 2), Array(3, 4))

  // Dos recorridos permiten visitar cada fila y cada elemento.
  for fila <- matriz do
    for valor <- fila do print(s"$valor ")
    println()
