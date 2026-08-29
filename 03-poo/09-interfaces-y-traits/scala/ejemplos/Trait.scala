trait Exportable:
  def exportar: String
class Reporte extends Exportable:
  def exportar: String = "reporte.csv"

@main def traitEjemplo(): Unit = println(new Reporte().exportar)
