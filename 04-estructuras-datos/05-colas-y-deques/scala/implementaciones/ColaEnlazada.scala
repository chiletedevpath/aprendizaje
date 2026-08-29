import scala.collection.mutable.Queue

final class ColaEnlazada[A]:
  private val datos = Queue.empty[A]
  // Queue mantiene el orden FIFO y encapsula el detalle de los enlaces internos.
  def offer(dato: A): Unit = datos.enqueue(dato)
  def poll(): A = datos.dequeue()
