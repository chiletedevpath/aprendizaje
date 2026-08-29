class SaldoInsuficienteException(mensaje: String) extends Exception(mensaje)
class CuentaSaldo(private var saldo: Double):
  def retirar(monto: Double): Unit =
    if monto > saldo then throw new SaldoInsuficienteException("Saldo insuficiente")
    saldo -= monto

@main def excepcionDominio(): Unit =
  try new CuentaSaldo(50).retirar(80)
  catch case e: SaldoInsuficienteException => println(e.getMessage)
