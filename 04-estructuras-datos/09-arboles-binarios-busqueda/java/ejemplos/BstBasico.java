public class BstBasico {
    static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;
        Nodo(int valor) { this.valor = valor; }
    }

    static Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);

        // Un BST coloca valores menores a la izquierda y mayores a la derecha.
        if (valor < nodo.valor) nodo.izquierdo = insertar(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = insertar(nodo.derecho, valor);
        return nodo;
    }

    public static void main(String[] args) {
        Nodo raiz = null;
        for (int valor : new int[]{50, 30, 70, 20, 40}) raiz = insertar(raiz, valor);
        System.out.println("Raíz: " + raiz.valor);
    }
}
