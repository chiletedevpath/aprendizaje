import java.util.Arrays;

public class InsertionSortPractica {
    static void insercion(int[] datos) {
        for (int i = 1; i < datos.length; i++) {
            int actual = datos[i];
            int j = i - 1;
            // Desplaza valores mayores para abrir espacio al elemento actual.
            while (j >= 0 && datos[j] > actual) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = actual;
        }
    }

    public static void main(String[] args) {
        int[] datos = {8, 3, 5, 1, 7};
        insercion(datos);
        System.out.println(Arrays.toString(datos));
    }
}
