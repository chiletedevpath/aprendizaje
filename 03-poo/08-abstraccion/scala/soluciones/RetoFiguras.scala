abstract class FiguraReto:
  def area: Double
class CirculoReto(val radio: Double) extends FiguraReto:
  def area: Double = math.Pi * radio * radio
class RectanguloReto(val base: Double,val altura: Double) extends FiguraReto:
  def area: Double = base * altura

@main def retoFiguras(): Unit = List[FiguraReto](new CirculoReto(2),new RectanguloReto(3,4)).foreach(f => println(f.area))
