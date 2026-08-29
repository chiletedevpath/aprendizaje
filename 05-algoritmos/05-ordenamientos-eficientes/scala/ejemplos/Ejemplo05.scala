object MergeSort:
  def ordenar(xs: List[Int]): List[Int] = xs match
    case Nil | _ :: Nil => xs
    case _ =>
      val (a,b)=xs.splitAt(xs.length/2)
      mezclar(ordenar(a), ordenar(b))
  def mezclar(a: List[Int], b: List[Int]): List[Int] = (a,b) match
    case (Nil, ys) => ys
    case (xs, Nil) => xs
    case (x::xs, y::ys) => if x <= y then x :: mezclar(xs,b) else y :: mezclar(a,ys)
  @main def ejecutar(): Unit = println(ordenar(List(9,4,7,3,10,5)))
