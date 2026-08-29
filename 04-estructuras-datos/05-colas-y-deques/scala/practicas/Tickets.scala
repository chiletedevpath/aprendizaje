import scala.collection.mutable.Queue
object Tickets:
  def main(args:Array[String]):Unit =
    val q=Queue("T1","T2","T3"); while q.nonEmpty do println(q.dequeue())
