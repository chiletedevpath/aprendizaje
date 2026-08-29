@main def retoCursos(): Unit =
  val estudiantes = Map("Java" -> 18, "Scala" -> 10, "Web" -> 24)
  // maxBy selecciona la entrada cuyo valor numérico es mayor.
  val (curso, cantidad) = estudiantes.maxBy(_._2)
  println(s"Mayor: $curso ($cantidad)")
