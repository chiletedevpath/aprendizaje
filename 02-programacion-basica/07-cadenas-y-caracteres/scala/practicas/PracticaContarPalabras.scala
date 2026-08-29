@main def practicaContarPalabras(): Unit =
  val texto = "  aprender programación con práctica  ".trim
  // split separa el texto usando uno o más espacios como delimitador.
  val palabras = if texto.isEmpty then Array.empty[String] else texto.split("\\s+")
  println(s"Palabras: ${palabras.length}")
