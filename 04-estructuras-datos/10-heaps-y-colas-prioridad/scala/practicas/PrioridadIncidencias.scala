import scala.collection.mutable.PriorityQueue
object PrioridadIncidencias:
  case class I(c:String,p:Int)
  given Ordering[I]=Ordering.by(i => -i.p)
  def main(args:Array[String]):Unit =
    val q=PriorityQueue(I("I1",2),I("I2",1)); while q.nonEmpty do println(q.dequeue())
