object ListInmutable:
  def main(args: Array[String]): Unit =
    val cursos = List("Java", "Scala", "Datos")
    // :: crea una nueva lista colocando el elemento al inicio.
    val ampliada = "Fundamentos" :: cursos
    println(ampliada)
