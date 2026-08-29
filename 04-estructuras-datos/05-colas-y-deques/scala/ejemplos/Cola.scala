import scala.collection.mutable.ArrayDeque

object Cola:
  def main(args: Array[String]): Unit =
    val cola = ArrayDeque.empty[String]
    // append agrega al final y removeHead retira desde el inicio: FIFO.
    cola.append("T-001")
    cola.append("T-002")
    println(cola.removeHead())
