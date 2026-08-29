import scala.collection.mutable.ArrayDeque
object ColaAtencion:
  def main(args:Array[String]):Unit =
    val q=ArrayDeque("T1","T2"); q.prepend("URG"); while q.nonEmpty do println(q.removeHead())
