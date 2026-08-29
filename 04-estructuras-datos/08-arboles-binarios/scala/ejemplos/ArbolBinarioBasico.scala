case class Nodo(valor: String, izquierdo: Option[Nodo] = None, derecho: Option[Nodo] = None)

object ArbolBinarioBasico:
  def main(args: Array[String]): Unit =
    val raiz = Nodo("Programación", Some(Nodo("Backend")), Some(Nodo("Frontend")))
    // Option representa de forma explícita si existe o no un hijo.
    println(raiz.izquierdo.map(_.valor))
