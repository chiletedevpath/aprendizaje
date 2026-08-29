object Practica11:
  def dfs(g:Map[String,List[String]], actual:String, visitados:Set[String]=Set.empty):Set[String] =
    if visitados(actual) then visitados
    else
      val nuevos=visitados+actual
      g.getOrElse(actual,Nil).foldLeft(nuevos)((v,vecino)=>dfs(g,vecino,v))
  @main def ejecutar():Unit = println(dfs(Map("A"->List("B","C"),"B"->List("D"),"C"->Nil,"D"->Nil),"A"))
