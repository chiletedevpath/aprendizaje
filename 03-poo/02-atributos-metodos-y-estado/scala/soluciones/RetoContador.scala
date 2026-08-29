class ContadorReto:
  private var valor = 0
  def incrementar(): Unit = valor += 1
  def mostrarValor: Int = valor

@main def retoContador(): Unit =
  val c = new ContadorReto
  c.incrementar(); c.incrementar()
  println(c.mostrarValor)
