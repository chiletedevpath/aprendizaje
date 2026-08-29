class Cuenta:
  private var saldo = 0.0
  def depositar(monto: Double): Unit = if monto > 0 then saldo += monto
  def saldoActual: Double = saldo

@main def encapsulamiento(): Unit =
  val cuenta = new Cuenta
  cuenta.depositar(100)
  println(cuenta.saldoActual)
