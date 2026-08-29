@main def listas(): Unit =
  // List representa una secuencia inmutable y ordenada.
  val cursos = List("Java", "Scala", "Bases de datos")
  val actualizados = cursos :+ "Web"
  println(actualizados)
