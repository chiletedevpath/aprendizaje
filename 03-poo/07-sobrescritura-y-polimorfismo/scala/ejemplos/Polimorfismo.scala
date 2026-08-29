trait Notificacion:
  def enviar(): Unit
class Email extends Notificacion:
  def enviar(): Unit = println("Email enviado")
class Sms extends Notificacion:
  def enviar(): Unit = println("SMS enviado")

@main def polimorfismo(): Unit =
  val canales: List[Notificacion] = List(new Email, new Sms)
  canales.foreach(_.enviar())
