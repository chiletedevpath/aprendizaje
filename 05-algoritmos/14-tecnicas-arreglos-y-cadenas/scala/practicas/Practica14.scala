object Practica14:
  def existeSuma(a:Array[Int],objetivo:Int):Boolean =
    var i=0; var j=a.length-1
    while i<j do
      val s=a(i)+a(j)
      if s==objetivo then return true
      if s<objetivo then i+=1 else j-=1
    false
  @main def ejecutar():Unit = println(existeSuma(Array(1,3,4,6,8,10),14))
