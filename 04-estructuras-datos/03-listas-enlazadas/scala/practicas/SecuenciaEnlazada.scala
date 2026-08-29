object SecuenciaEnlazada:
  def main(args: Array[String]): Unit =
    val tareas = List("Analizar", "Programar", "Probar")
    // List está optimizada para construir nuevas secuencias desde el inicio.
    val completa = "Planificar" :: tareas
    println(completa.mkString(" -> "))
