@main def operacionesString(): Unit =
  val curso = "  Scala Básico  "
  // trim elimina espacios en los extremos y toUpperCase normaliza el texto.
  val limpio = curso.trim
  println(limpio.toUpperCase)
  println(s"Longitud: ${limpio.length}")
