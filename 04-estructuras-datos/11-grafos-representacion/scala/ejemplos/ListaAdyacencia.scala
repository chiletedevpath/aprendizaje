object ListaAdyacencia:
  def main(args: Array[String]): Unit =
    val grafo = Map("Chilete" -> Set("Cajamarca", "Trujillo"), "Cajamarca" -> Set("Chilete"))
    // Cada clave es un vértice y su Set contiene los vecinos directos.
    println(grafo("Chilete"))
