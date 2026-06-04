public class SecuenciaOrdenadaDesordenada {

    public static void main(String[] args) {

        // Arreglo base
        int[] arreglo = {20, 5, 10, 8, 35, 60, 16, 44, 35};
        int clave = 35;

        System.out.println("=== BÚSQUEDA SECUENCIAL ORDENADA Y DESORDENADA ===\n");

        // Mostrar el arreglo original
        System.out.print("Arreglo original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("\nClave a buscar: " + clave + "\n");

        // --- BÚSQUEDA SECUENCIAL DESORDENADA ---
        System.out.println(">>> BÚSQUEDA SECUENCIAL DESORDENADA <<<");
        int resultadoDes = busquedaSecuencialDesordenada(arreglo, clave);
        if (resultadoDes != -1)
            System.out.println("Elemento encontrado en la posición: " + resultadoDes);
        else
            System.out.println("Elemento no encontrado.");
        System.out.println();

        // --- BÚSQUEDA SECUENCIAL ORDENADA ---
        System.out.println(">>> BÚSQUEDA SECUENCIAL ORDENADA <<<");
        // Copiamos el arreglo para no alterar el original
        int[] arregloOrdenado = arreglo.clone();
        java.util.Arrays.sort(arregloOrdenado); // Ordenamos ascendentemente

        System.out.print("Arreglo ordenado: ");
        for (int num : arregloOrdenado) {
            System.out.print(num + " ");
        }
        System.out.println();

        int resultadoOrd = busquedaSecuencialOrdenada(arregloOrdenado, clave);
        if (resultadoOrd != -1)
            System.out.println("Elemento encontrado en la posición (ordenado): " + resultadoOrd);
        else
            System.out.println("Elemento no encontrado (ordenado).");
    }

    // --- MÉTODO PARA BÚSQUEDA SECUENCIAL DESORDENADA ---
    public static int busquedaSecuencialDesordenada(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            // Comparamos cada elemento con la clave
            if (arreglo[i] == clave) {
                return i; // Devuelve la posición donde se encontró
            }
        }
        return -1; // No se encontró
    }

    // --- MÉTODO PARA BÚSQUEDA SECUENCIAL ORDENADA ---
    public static int busquedaSecuencialOrdenada(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            // Si encontramos la clave, devolvemos su posición
            if (arreglo[i] == clave) {
                return i;
            }
            // Si el valor actual es mayor que la clave, podemos detener la búsqueda
            if (arreglo[i] > clave) {
                break;
            }
        }
        return -1;
    }
}
