import java.util.Scanner;

public class RetoNumerosHastaCero {
    public static void main(String[] args) {
        int cantidad = 0;
        int suma = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Número (0 termina): ");
                int numero = scanner.nextInt();
                // El centinela controla el final sin formar parte de los datos.
                if (numero == 0) break;
                suma += numero;
                cantidad++;
            }
        }

        double promedio = cantidad == 0 ? 0 : (double) suma / cantidad;
        System.out.printf("Cantidad: %d | Suma: %d | Promedio: %.2f%n", cantidad, suma, promedio);
    }
}
