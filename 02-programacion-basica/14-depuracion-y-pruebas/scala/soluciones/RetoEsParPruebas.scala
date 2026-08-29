def esParReto(numero: Int): Boolean = numero % 2 == 0

@main def retoEsParPruebas(): Unit =
  // Cada tupla contiene una entrada y el resultado esperado para esa prueba.
  val casos = List(8 -> true, 7 -> false, 0 -> true, -4 -> true, -3 -> false)
  for (numero, esperado) <- casos do
    val obtenido = esParReto(numero)
    val estado = if esperado == obtenido then "OK" else "ERROR"
    println(s"$numero | esperado=$esperado | obtenido=$obtenido | $estado")
