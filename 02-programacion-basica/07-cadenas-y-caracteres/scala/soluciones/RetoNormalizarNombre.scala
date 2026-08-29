def normalizar(texto: String): String =
  texto.trim.toLowerCase.split("\\s+").filter(_.nonEmpty).map(_.capitalize).mkString(" ")

def contarVocales(texto: String): Int =
  val vocales = "aeiouáéíóú"
  // count conserva solo los caracteres que cumplen el predicado.
  texto.toLowerCase.count(vocales.contains(_))

@main def retoNormalizarNombre(): Unit =
  val nombre = normalizar("  aDRian ivAN pisco  ")
  println(nombre)
  println(s"Vocales: ${contarVocales(nombre)}")
