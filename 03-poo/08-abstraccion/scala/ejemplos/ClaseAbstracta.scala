abstract class Figura:
  def area: Double
class Cuadrado(val lado: Double) extends Figura:
  def area: Double = lado * lado

@main def claseAbstracta(): Unit = println(new Cuadrado(4).area)
