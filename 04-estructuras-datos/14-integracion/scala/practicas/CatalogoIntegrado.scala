import scala.collection.mutable.PriorityQueue

case class RecursoIntegrado(codigo: String, categoria: String)
case class SolicitudIntegrada(codigo: String, prioridad: Int)

object CatalogoIntegrado:
  def main(args: Array[String]): Unit =
    val recursos = Vector(RecursoIntegrado("R1", "Programación"), RecursoIntegrado("R2", "Datos"))
    val indice = recursos.map(r => r.codigo -> r).toMap
    val categorias = recursos.map(_.categoria).toSet
    given Ordering[SolicitudIntegrada] = Ordering.by(s => -s.prioridad)
    val solicitudes = PriorityQueue(SolicitudIntegrada("R2", 2), SolicitudIntegrada("R1", 1))
    // Cada estructura resuelve una necesidad distinta del mismo modelo.
    println(indice("R1")); println(categorias); println(solicitudes.dequeue())
