class Usuario(val nombre: String):
  Usuario.registrar()
object Usuario:
  private var creados = 0
  private def registrar(): Unit = creados += 1
  def total: Int = creados

@main def claseEInstancia(): Unit =
  new Usuario("Ana"); new Usuario("Luis")
  println(Usuario.total)
