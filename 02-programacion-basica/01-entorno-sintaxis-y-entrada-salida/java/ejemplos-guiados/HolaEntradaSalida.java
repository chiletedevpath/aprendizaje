import java.util.Scanner;

public class HolaEntradaSalida {
    public static void main(String[] args) {
        // Scanner conecta el programa con la entrada estándar (teclado).
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre del aprendiz: ");
            String nombre = scanner.nextLine().trim();

            // printf permite construir una salida formateada sin concatenaciones innecesarias.
            System.out.printf("Bienvenido, %s. El entorno Java funciona correctamente.%n", nombre);
        }
    }
}
