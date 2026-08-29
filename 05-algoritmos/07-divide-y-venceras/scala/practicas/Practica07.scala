object Practica07:
  def suma(a:Array[Int],l:Int,r:Int):Int =
    if l==r then a(l)
    else
      val m=l+(r-l)/2
      suma(a,l,m)+suma(a,m+1,r)
  @main def ejecutar():Unit = { val a=Array(1,2,3,4,5); println(suma(a,0,a.length-1)) }
