case class NodoCategoria(v:String,i:Option[NodoCategoria]=None,d:Option[NodoCategoria]=None)
object ArbolCategorias:
  def main(args:Array[String]):Unit = println(NodoCategoria("Tech",Some(NodoCategoria("Backend")),Some(NodoCategoria("Frontend"))))
