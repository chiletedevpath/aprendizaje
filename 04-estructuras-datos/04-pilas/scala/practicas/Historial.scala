import scala.collection.mutable.ArrayDeque
object Historial:
  def main(args:Array[String]):Unit =
    val p=ArrayDeque.empty[String]; p.prepend("Inicio"); p.prepend("Ruta"); println(p.removeHead())
