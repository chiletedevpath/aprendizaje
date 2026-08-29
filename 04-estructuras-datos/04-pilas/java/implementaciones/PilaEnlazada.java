import java.util.NoSuchElementException;

public class PilaEnlazada<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato, Nodo<T> siguiente) { this.dato = dato; this.siguiente = siguiente; }
    }

    private Nodo<T> cima;

    public void push(T dato) {
        // El nuevo nodo apunta a la antigua cima y pasa a ser la nueva cima.
        cima = new Nodo<>(dato, cima);
    }

    public T pop() {
        if (cima == null) throw new NoSuchElementException("Pila vacía");
        T dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public T peek() {
        if (cima == null) throw new NoSuchElementException("Pila vacía");
        return cima.dato;
    }
}
