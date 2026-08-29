public class ArbolBinarioBusqueda {
    private static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;
        Nodo(int valor) { this.valor = valor; }
    }

    private Nodo raiz;

    public void insertar(int valor) { raiz = insertar(raiz, valor); }
    private Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor) nodo.izquierdo = insertar(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = insertar(nodo.derecho, valor);
        return nodo;
    }

    public boolean contiene(int valor) {
        Nodo actual = raiz;
        while (actual != null) {
            if (valor == actual.valor) return true;
            // La propiedad de orden decide qué subárbol puede contener el valor.
            actual = valor < actual.valor ? actual.izquierdo : actual.derecho;
        }
        return false;
    }
}
