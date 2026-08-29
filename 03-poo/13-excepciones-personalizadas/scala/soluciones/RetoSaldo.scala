class SaldoInsuficienteReto(saldo: Double, monto: Double) extends Exception(s"Saldo $saldo menor que retiro $monto")
class CuentaReto(private var saldo: Double):
  def retirar(monto: Double): Unit =
    if monto > saldo then throw new SaldoInsuficienteReto(saldo,monto)
    saldo -= monto

@main def retoSaldo(): Unit =
  try new CuentaReto(100).retirar(120)
  catch case e: SaldoInsuficienteReto => println(e.getMessage)
