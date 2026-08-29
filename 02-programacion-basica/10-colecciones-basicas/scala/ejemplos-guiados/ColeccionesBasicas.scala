object ColeccionesBasicas:
  def main(args: Array[String]): Unit =
    // Las colecciones literales de este ejemplo son inmutables.
    val cursos = List("Java", "Scala", "Java")
    val cursosUnicos = cursos.toSet
    val avance = Map("Java" -> 70, "Scala" -> 25)

    println(s"Lista: $cursos")
    println(s"Sin duplicados: $cursosUnicos")
    println(s"Avance Java: ${avance("Java")}%")
