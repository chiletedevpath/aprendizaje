case class Categoria(nombre: String, izquierda: Option[Categoria] = None, derecha: Option[Categoria] = None)

object ArbolCategorias:
  def main(args: Array[String]): Unit =
    val raiz = Categoria("Tecnología", Some(Categoria("Backend")), Some(Categoria("Frontend")))
    // Cada Option indica si la rama contiene un nodo hijo.
    println(raiz)
