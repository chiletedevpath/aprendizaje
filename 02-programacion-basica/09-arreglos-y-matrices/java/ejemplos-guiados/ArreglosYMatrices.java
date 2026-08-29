import java.util.Arrays;

public class ArreglosYMatrices {
    public static void main(String[] args) {
        int[] notas = {12, 18, 15, 10};
        int suma = 0;

        // El for-each recorre todos los elementos sin manipular índices.
        for (int nota : notas) {
            suma += nota;
        }

        int[][] matriz = {{1, 2}, {3, 4}};
        double promedio = suma / (double) notas.length;

        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Promedio: " + promedio);
        System.out.println("Elemento fila 1, columna 0: " + matriz[1][0]);
    }
}
