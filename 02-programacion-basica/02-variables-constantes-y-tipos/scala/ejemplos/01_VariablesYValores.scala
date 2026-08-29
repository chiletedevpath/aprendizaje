@main def variablesYValores(): Unit =
  // val define una referencia que no se reasigna; var permite cambiarla.
  val lenguaje: String = "Scala"
  var nivel: Int = 1
  nivel += 1

  val activo: Boolean = true
  println(s"$lenguaje | nivel=$nivel | activo=$activo")
