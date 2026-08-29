object SeleccionActividades:
  case class Actividad(inicio:Int, fin:Int)
  @main def ejecutar(): Unit =
    val actividades=List(Actividad(1,4),Actividad(3,5),Actividad(0,6),Actividad(5,7),Actividad(8,9)).sortBy(_.fin)
    var ultimo=Int.MinValue
    actividades.foreach { a => if a.inicio >= ultimo then { println(a); ultimo=a.fin } }
