case class CursoModelo(codigo: String)
case class EstudianteModelo(nombre: String)
case class InscripcionModelo(curso: CursoModelo, estudiante: EstudianteModelo)

@main def retoModeloCursos(): Unit = println(InscripcionModelo(CursoModelo("POO-01"),EstudianteModelo("Aprendiz")))
