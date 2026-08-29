public class MaximoPorMitades {
    static int maximo(int[] datos, int inicio, int fin) {
        if (inicio == fin) return datos[inicio];
        int medio = inicio + (fin - inicio) / 2;
        int izquierda = maximo(datos, inicio, medio);
        int derecha = maximo(datos, medio + 1, fin);
        // La combinación conserva el mayor resultado de ambas mitades.
        return Math.max(izquierda, derecha);
    }

    public static void main(String[] args) {
        int[] datos = {12, 4, 31, 8, 19, 6};
        System.out.println(maximo(datos, 0, datos.length - 1));
    }
}
