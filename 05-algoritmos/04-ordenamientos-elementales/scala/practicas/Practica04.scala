object Practica04:
  def bubble(a:Array[Int]):Unit =
    for fin <- (a.length-1 to 1 by -1); i <- 0 until fin do
      if a(i)>a(i+1) then
        val t=a(i); a(i)=a(i+1); a(i+1)=t
  @main def ejecutar():Unit = { val a=Array(5,1,4,2,8); bubble(a); println(a.mkString(", ")) }
