public class ArbolBinarioBasico {
    static class Nodo {
        String valor;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(String valor) { this.valor = valor; }
    }

    public static void main(String[] args) {
        Nodo raiz = new Nodo("Programación");

        // Cada referencia conecta un nodo con uno de sus hijos.
        raiz.izquierdo = new Nodo("Backend");
        raiz.derecho = new Nodo("Frontend");

        System.out.println("Raíz: " + raiz.valor);
        System.out.println("Hijo izquierdo: " + raiz.izquierdo.valor);
        System.out.println("Hijo derecho: " + raiz.derecho.valor);
    }
}
