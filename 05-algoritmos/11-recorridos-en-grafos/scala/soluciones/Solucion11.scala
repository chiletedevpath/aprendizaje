import scala.collection.mutable
object BfsBasico:
  def bfs(g: Map[String,List[String]], origen:String): Unit =
    val cola=mutable.Queue(origen); val visitados=mutable.Set(origen)
    while cola.nonEmpty do
      val actual=cola.dequeue(); print(s"$actual ")
      g.getOrElse(actual,Nil).foreach(v => if visitados.add(v) then cola.enqueue(v))
  @main def ejecutar(): Unit = bfs(Map("A"->List("B","C"),"B"->List("D"),"C"->List("D"),"D"->Nil),"A")
