@main def mapas(): Unit =
  // Map asocia claves únicas con valores.
  val avances = Map("Java" -> 70, "Scala" -> 30)
  println(s"Java: ${avances("Java")}%")
