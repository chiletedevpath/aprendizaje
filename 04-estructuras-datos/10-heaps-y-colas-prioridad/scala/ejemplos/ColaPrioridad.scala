import scala.collection.mutable.PriorityQueue

object ColaPrioridad:
  case class Incidencia(codigo: String, prioridad: Int)

  def main(args: Array[String]): Unit =
    given Ordering[Incidencia] = Ordering.by(i => -i.prioridad)
    val cola = PriorityQueue.empty[Incidencia]
    // El Ordering define qué incidencia debe salir primero.
    cola.enqueue(Incidencia("INC-003", 3), Incidencia("INC-001", 1))
    println(cola.dequeue())
