class ValidadorReto:
  def correoValido(c: String): Boolean = c != null && c.contains("@")
trait NotificadorReto:
  def enviar(destino: String): Unit
class ConsolaReto extends NotificadorReto:
  def enviar(destino: String): Unit = println(s"Enviado a $destino")
class ServicioRegistro(validador: ValidadorReto, notificador: NotificadorReto):
  def registrar(correo: String): Unit =
    require(validador.correoValido(correo))
    notificador.enviar(correo)

@main def retoResponsabilidades(): Unit = new ServicioRegistro(new ValidadorReto,new ConsolaReto).registrar("usuario@example.com")
