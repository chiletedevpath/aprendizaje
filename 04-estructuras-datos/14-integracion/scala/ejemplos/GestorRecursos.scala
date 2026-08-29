import scala.collection.mutable.PriorityQueue

case class Recurso(codigo: String, titulo: String, categoria: String)
case class Solicitud(codigoRecurso: String, prioridad: Int)

object GestorRecursos:
  def main(args: Array[String]): Unit =
    val recursos = Vector(Recurso("R-001", "Guía de Scala", "Programación"))
    val porCodigo = recursos.map(r => r.codigo -> r).toMap
    val categorias = recursos.map(_.categoria).toSet
    given Ordering[Solicitud] = Ordering.by(s => -s.prioridad)
    val solicitudes = PriorityQueue(Solicitud("R-001", 1))
    // Map indexa por código y PriorityQueue organiza las solicitudes por prioridad.
    println(porCodigo("R-001"))
    println(categorias)
    println(solicitudes.dequeue())
