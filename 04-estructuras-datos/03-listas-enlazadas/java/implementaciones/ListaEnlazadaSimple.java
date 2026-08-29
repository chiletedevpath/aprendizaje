public class ListaEnlazadaSimple<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public void agregar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        // cola referencia el último nodo para agregar sin recorrer toda la lista.
        if (cabeza == null) cabeza = nuevo;
        else cola.siguiente = nuevo;
        cola = nuevo;
        tamano++;
    }

    public boolean eliminar(T dato) {
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (java.util.Objects.equals(actual.dato, dato)) {
                if (anterior == null) cabeza = actual.siguiente;
                else anterior.siguiente = actual.siguiente;
                if (actual == cola) cola = anterior;
                tamano--;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamano() { return tamano; }
}
