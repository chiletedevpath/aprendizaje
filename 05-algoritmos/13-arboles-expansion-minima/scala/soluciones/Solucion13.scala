object KruskalConcepto:
  case class Arista(u:Int,v:Int,peso:Int)
  @main def ejecutar():Unit =
    val aristas=List(Arista(0,1,4),Arista(0,2,1),Arista(2,1,2)).sortBy(_.peso)
    // Kruskal considera las aristas de menor a mayor costo y evita ciclos.
    aristas.foreach(println)
