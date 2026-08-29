class Sesion:
  Sesion.registrar()
object Sesion:
  private var total=0
  private def registrar(): Unit = total+=1
  def activas: Int = total
@main def practicaInstancias(): Unit = { new Sesion; new Sesion; println(Sesion.activas) }
