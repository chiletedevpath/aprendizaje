import java.util.Arrays;

public class CompararBusquedas {
    static int lineal(int[] datos, int clave) {
        for (int i = 0; i < datos.length; i++) if (datos[i] == clave) return i;
        return -1;
    }

    static int binaria(int[] datos, int clave) {
        int izquierda = 0, derecha = datos.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (datos[medio] == clave) return medio;
            // La búsqueda binaria solo puede descartar mitades si los datos están ordenados.
            if (datos[medio] < clave) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {9, 2, 14, 5, 7, 20};
        System.out.println("Lineal: " + lineal(datos, 14));
        Arrays.sort(datos);
        System.out.println("Binaria: " + binaria(datos, 14));
    }
}
