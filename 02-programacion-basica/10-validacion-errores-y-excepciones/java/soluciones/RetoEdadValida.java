import java.util.Scanner;

public class RetoEdadValida {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Edad: ");
                String entrada = scanner.nextLine().trim();
                try {
                    int edad = Integer.parseInt(entrada);
                    if (edad < 0 || edad > 120) {
                        System.out.println("Edad fuera de rango");
                        continue;
                    }
                    System.out.println("Edad válida: " + edad);
                    break;
                } catch (NumberFormatException e) {
                    // La excepción distingue un formato incorrecto de un valor fuera de rango.
                    System.out.println("Debe ingresar un número entero");
                }
            }
        }
    }
}
