import java.util.Scanner;

public class LeerNombre {
    public static void main(String[] args) {
        // Scanner conecta el programa con la entrada estándar (teclado).
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre: ");
            // nextLine() lee una línea completa de texto.
            String nombre = scanner.nextLine().trim();
            System.out.printf("Bienvenido, %s.%n", nombre);
        }
    }
}
