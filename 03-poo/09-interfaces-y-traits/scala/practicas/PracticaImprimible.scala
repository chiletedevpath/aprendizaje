trait Imprimible:
  def imprimir(): Unit
class Ficha extends Imprimible:
  def imprimir(): Unit = println("Ficha impresa")
@main def practicaImprimible(): Unit = new Ficha().imprimir()
