class ValidadorUsuario:
  def esValido(correo: String): Boolean = correo != null && correo.contains("@")
trait Notificador:
  def enviar(correo: String): Unit
class ConsolaNotificador extends Notificador:
  def enviar(correo: String): Unit = println(s"Notificación a $correo")
class RegistroUsuario(validador: ValidadorUsuario, notificador: Notificador):
  def registrar(correo: String): Unit =
    require(validador.esValido(correo))
    notificador.enviar(correo)

@main def responsabilidades(): Unit = new RegistroUsuario(new ValidadorUsuario,new ConsolaNotificador).registrar("aprendiz@example.com")
