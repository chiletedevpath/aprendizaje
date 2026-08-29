case class AlumnoModelo(nombre: String)
case class AsignaturaModelo(nombre: String)
case class MatriculaModelo(alumno: AlumnoModelo, asignatura: AsignaturaModelo)
@main def practicaMatricula(): Unit = println(MatriculaModelo(AlumnoModelo("Ana"),AsignaturaModelo("POO")))
