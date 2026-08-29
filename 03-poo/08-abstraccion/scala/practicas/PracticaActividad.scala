abstract class Actividad(val titulo: String):
  def puntaje: Int
class Lectura(titulo: String) extends Actividad(titulo):
  def puntaje: Int = 10
@main def practicaActividad(): Unit = println(new Lectura("POO").puntaje)
