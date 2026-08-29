trait Pago:
  def procesar(): String
class Tarjeta extends Pago:
  def procesar(): String = "Pago con tarjeta"
class Transferencia extends Pago:
  def procesar(): String = "Pago por transferencia"
@main def practicaPagos(): Unit = List[Pago](new Tarjeta,new Transferencia).foreach(p=>println(p.procesar()))
