def promedioPrueba(valores: List[Int]): Double =
  if valores.isEmpty then 0.0 else valores.sum.toDouble / valores.size

@main def practicaValidarPromedio(): Unit =
  val casos = List(
    (List(10, 20), 15.0),
    (List(20), 20.0),
    (List.empty[Int], 0.0)
  )

  for (entrada, esperado) <- casos do
    val obtenido = promedioPrueba(entrada)
    // La prueba compara el resultado real con un valor conocido de antemano.
    println(s"esperado=$esperado | obtenido=$obtenido | ${if esperado == obtenido then "OK" else "ERROR"}")
