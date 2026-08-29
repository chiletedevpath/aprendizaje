final class PilaEnlazada[A]:
  private final class Nodo(val dato: A, val siguiente: Nodo | Null)
  private var cima: Nodo | Null = null

  def push(dato: A): Unit = cima = new Nodo(dato, cima)

  def pop(): A =
    if cima == null then throw new NoSuchElementException("Pila vacía")
    val actual = cima.asInstanceOf[Nodo]
    // La cima avanza al siguiente nodo después de retirar el actual.
    cima = actual.siguiente
    actual.dato
