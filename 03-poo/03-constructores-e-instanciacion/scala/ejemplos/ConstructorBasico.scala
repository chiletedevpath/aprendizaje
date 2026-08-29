class CursoConstruido(val titulo: String)

@main def constructorBasico(): Unit =
  // Los parámetros del constructor inicializan el objeto al crearlo.
  val curso = new CursoConstruido("POO")
  println(curso.titulo)
