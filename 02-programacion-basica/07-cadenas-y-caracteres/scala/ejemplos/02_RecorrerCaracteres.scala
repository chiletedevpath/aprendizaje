@main def recorrerCaracteres(): Unit =
  val palabra = "Chilete"

  // zipWithIndex combina cada carácter con su índice.
  for (caracter, indice) <- palabra.zipWithIndex do
    println(s"$indice -> $caracter")
