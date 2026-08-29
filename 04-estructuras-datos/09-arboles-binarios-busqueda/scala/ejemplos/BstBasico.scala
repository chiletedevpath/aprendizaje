enum Bst:
  case Vacio
  case Nodo(valor: Int, izquierdo: Bst = Vacio, derecho: Bst = Vacio)

object BstBasico:
  def insertar(arbol: Bst, valor: Int): Bst = arbol match
    case Bst.Vacio => Bst.Nodo(valor)
    case Bst.Nodo(v, izq, der) if valor < v => Bst.Nodo(v, insertar(izq, valor), der)
    case Bst.Nodo(v, izq, der) if valor > v => Bst.Nodo(v, izq, insertar(der, valor))
    case _ => arbol

  def main(args: Array[String]): Unit =
    // La propiedad de orden decide en qué subárbol insertar.
    val arbol = List(50, 30, 70).foldLeft[Bst](Bst.Vacio)(insertar)
    println(arbol)
