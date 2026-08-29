class Curso(var titulo: String)

@main def claseYObjeto(): Unit =
  // new crea un objeto concreto a partir de la clase Curso.
  val curso = new Curso("Scala básico")
  println(curso.titulo)
