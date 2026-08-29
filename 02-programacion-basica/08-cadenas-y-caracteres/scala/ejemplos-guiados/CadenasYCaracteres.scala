object CadenasYCaracteres:
  def main(args: Array[String]): Unit =
    val entrada = "  Chilete   DevPath  "

    // split + filter + mkString normaliza espacios sin modificar la cadena original.
    val normalizada = entrada.trim.split("\\s+").filter(_.nonEmpty).mkString(" ").toUpperCase
    val vocales = normalizada.count(c => "AEIOU".contains(c))

    println(s"Texto: $normalizada")
    println(s"Vocales: $vocales")
