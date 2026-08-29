class CuentaAhorro(private var saldo: Double):
  require(saldo >= 0)
  def retirar(monto: Double): Boolean =
    if monto <= 0 || monto > saldo then false
    else { saldo -= monto; true }
  def saldoActual: Double = saldo

@main def retoCuentaAhorro(): Unit =
  val c = new CuentaAhorro(100)
  c.retirar(40)
  println(c.saldoActual)
