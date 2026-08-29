import scala.collection.mutable

object Practica12:
  case class Arista(destino: String, costo: Int)

  def dijkstra(grafo: Map[String, List[Arista]], origen: String): Map[String, Int] =
    val distancias = mutable.Map.from(grafo.keys.map(_ -> Int.MaxValue))
    distancias(origen) = 0

    val menorDistanciaPrimero = Ordering.by[(Int, String), Int](elemento => -elemento._1)
    val pendientes = mutable.PriorityQueue.empty[(Int, String)](using menorDistanciaPrimero)
    pendientes.enqueue((0, origen))

    while pendientes.nonEmpty do
      val (distanciaActual, verticeActual) = pendientes.dequeue()
      if distanciaActual == distancias(verticeActual) then
        grafo.getOrElse(verticeActual, Nil).foreach { arista =>
          val nuevaDistancia = distanciaActual + arista.costo
          if nuevaDistancia < distancias(arista.destino) then
            distancias(arista.destino) = nuevaDistancia
            pendientes.enqueue((nuevaDistancia, arista.destino))
        }

    distancias.toMap

  @main def ejecutar(): Unit =
    val grafo = Map(
      "A" -> List(Arista("B", 4), Arista("C", 1)),
      "B" -> Nil,
      "C" -> List(Arista("B", 2))
    )
    println(dijkstra(grafo, "A"))
