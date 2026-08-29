class CursoReto(val titulo: String, val duracionHoras: Int):
  def ficha: String = s"$titulo - $duracionHoras horas"

@main def retoCurso(): Unit =
  println(new CursoReto("Scala", 16).ficha)
