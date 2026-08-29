class EmpleadoReto(val nombre: String):
  def responsabilidad: String = "Ejecutar tareas"
class SupervisorReto(nombre: String) extends EmpleadoReto(nombre):
  override def responsabilidad: String = "Coordinar al equipo"

@main def retoSupervisor(): Unit = println(new SupervisorReto("Luis").responsabilidad)
