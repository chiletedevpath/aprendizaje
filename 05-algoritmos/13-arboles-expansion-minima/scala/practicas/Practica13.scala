object Practica13:
  @main def ejecutar():Unit =
    val aristas=List((0,1,4),(0,2,1),(2,1,2),(1,3,1)).sortBy(_._3)
    // Ordenar por peso es el primer paso de Kruskal; luego se deben evitar ciclos.
    aristas.foreach(println)
