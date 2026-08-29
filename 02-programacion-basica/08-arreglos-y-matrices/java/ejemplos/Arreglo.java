import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {
        int[] notas = {15, 18, 12, 20};

        // length indica cuántas posiciones contiene el arreglo.
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("notas[%d] = %d%n", i, notas[i]);
        }

        System.out.println(Arrays.toString(notas));
    }
}
