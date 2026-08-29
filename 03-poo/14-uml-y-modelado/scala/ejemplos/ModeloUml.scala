case class Estudiante(nombre: String)
case class Curso(titulo: String)
case class Inscripcion(estudiante: Estudiante, curso: Curso)

@main def modeloUml(): Unit = println(Inscripcion(Estudiante("Ana"), Curso("POO")))
