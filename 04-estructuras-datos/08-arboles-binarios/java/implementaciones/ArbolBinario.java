public class ArbolBinario<T> {
    public static class Nodo<T> {
        public T dato;
        public Nodo<T> izquierdo;
        public Nodo<T> derecho;
        public Nodo(T dato) { this.dato = dato; }
    }

    private final Nodo<T> raiz;
    public ArbolBinario(Nodo<T> raiz) { this.raiz = raiz; }

    public int contarNodos() { return contar(raiz); }

    private int contar(Nodo<T> nodo) {
        // null marca el final de una rama.
        if (nodo == null) return 0;
        return 1 + contar(nodo.izquierdo) + contar(nodo.derecho);
    }
}
