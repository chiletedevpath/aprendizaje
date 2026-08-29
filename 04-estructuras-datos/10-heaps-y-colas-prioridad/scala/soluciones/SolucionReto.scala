import scala.collection.mutable.PriorityQueue
object IncidenciasPrioridad:
  case class I(c:String,p:Int)
  given Ordering[I]=Ordering.by(i => -i.p)
  def main(args:Array[String]):Unit =
    val q=PriorityQueue(I("A",3),I("B",1)); while q.nonEmpty do println(q.dequeue())
