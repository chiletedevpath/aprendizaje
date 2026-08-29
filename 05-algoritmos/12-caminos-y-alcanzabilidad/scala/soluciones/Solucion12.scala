object FloydWarshall:
  val INF=1000000
  def calcular(d:Array[Array[Int]]):Unit =
    for k <- d.indices; i <- d.indices; j <- d.indices do
      d(i)(j)=math.min(d(i)(j), d(i)(k)+d(k)(j))
  @main def ejecutar():Unit = { val d=Array(Array(0,3,INF),Array(INF,0,2),Array(5,INF,0)); calcular(d); d.foreach(r=>println(r.mkString(" "))) }
