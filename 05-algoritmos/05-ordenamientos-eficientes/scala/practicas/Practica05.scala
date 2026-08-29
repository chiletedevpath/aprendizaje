object Practica05:
  def quick(a:Array[Int], l:Int, r:Int):Unit =
    if l<r then
      val p=partir(a,l,r)
      quick(a,l,p-1); quick(a,p+1,r)
  def partir(a:Array[Int], l:Int, r:Int):Int =
    val pivote=a(r); var i=l-1
    for j <- l until r do if a(j)<=pivote then { i+=1; val t=a(i); a(i)=a(j); a(j)=t }
    val t=a(i+1); a(i+1)=a(r); a(r)=t; i+1
  @main def ejecutar():Unit = { val a=Array(9,4,7,3,10,5); quick(a,0,a.length-1); println(a.mkString(", ")) }
