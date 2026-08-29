class Contador:
  private var valor = 0
  def incrementar(): Unit = valor += 1
  def actual: Int = valor

@main def estadoYComportamiento(): Unit =
  val contador = new Contador
  contador.incrementar()
  println(contador.actual)
