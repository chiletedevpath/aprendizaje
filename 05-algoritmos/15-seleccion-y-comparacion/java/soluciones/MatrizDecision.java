public class MatrizDecision {
    static String recomendar(boolean ordenado, boolean necesitaTodos, int cantidad) {
        if (!necesitaTodos && ordenado) return "Búsqueda binaria";
        if (!necesitaTodos) return "Búsqueda lineal";
        if (cantidad < 30) return "Insertion Sort puede ser suficiente";
        // La elección depende de precondiciones y tamaño; no existe un algoritmo universalmente mejor.
        return "Evaluar O(n log n): Merge Sort o Quick Sort";
    }

    public static void main(String[] args) { System.out.println(recomendar(true, false, 10000)); }
}
