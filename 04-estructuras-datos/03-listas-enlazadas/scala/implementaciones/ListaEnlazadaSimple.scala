final class ListaEnlazadaSimple[A]:
  private final class Nodo(var dato: A, var siguiente: Nodo | Null)
  private var cabeza: Nodo | Null = null

  def agregarInicio(dato: A): Unit =
    // El nuevo nodo conserva la referencia a la cabeza anterior.
    cabeza = new Nodo(dato, cabeza)

  def estaVacia: Boolean = cabeza == null
