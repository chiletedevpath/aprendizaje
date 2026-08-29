trait Notificable:
  def enviar(mensaje: String): Unit
class EmailReto extends Notificable:
  def enviar(mensaje: String): Unit = println(s"Email: $mensaje")
class ChatReto extends Notificable:
  def enviar(mensaje: String): Unit = println(s"Chat: $mensaje")

@main def retoNotificaciones(): Unit = List[Notificable](new EmailReto,new ChatReto).foreach(_.enviar("Curso disponible"))
