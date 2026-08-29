import java.util.NoSuchElementException;

public class ColaEnlazada<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> frente;
    private Nodo<T> fin;

    public void offer(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        // fin mantiene el punto de inserción y frente mantiene el punto de extracción.
        if (fin == null) frente = nuevo;
        else fin.siguiente = nuevo;
        fin = nuevo;
    }

    public T poll() {
        if (frente == null) throw new NoSuchElementException("Cola vacía");
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return dato;
    }
}
