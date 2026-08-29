class Empleado(val nombre: String)
class Supervisor(nombre: String) extends Empleado(nombre):
  def coordinar(): Unit = println(s"$nombre coordina el equipo")

@main def herenciaBasica(): Unit = new Supervisor("Ana").coordinar()
