object SeleccionAlgoritmo:
  def recomendar(ordenado:Boolean, soloBuscar:Boolean, n:Int):String =
    if soloBuscar && ordenado then "Búsqueda binaria"
    else if soloBuscar then "Búsqueda lineal"
    else if n < 30 then "Insertion Sort" else "Evaluar Merge Sort o Quick Sort"
  @main def ejecutar():Unit = println(recomendar(true,true,10000))
