object Practica09:
  def sumaObjetivo(datos:List[Int], objetivo:Int):Boolean = datos match
    case _ if objetivo==0 => true
    case Nil => false
    case x::xs => sumaObjetivo(xs,objetivo-x) || sumaObjetivo(xs,objetivo)
  @main def ejecutar():Unit = println(sumaObjetivo(List(3,5,7,10),15))
