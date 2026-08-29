trait ExportableReto:
  def exportar: String
class Csv extends ExportableReto:
  def exportar: String = "datos,csv"
class Json extends ExportableReto:
  def exportar: String = "{\"datos\":true}"

@main def retoExportable(): Unit = List[ExportableReto](new Csv,new Json).foreach(r => println(r.exportar))
