import java.util.Scanner;

public class RetoFichaEstudiante {
    public static void main(String[] args) {
        // Scanner conecta el programa con la entrada estándar (teclado).
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Carrera: ");
            String carrera = scanner.nextLine().trim();

            System.out.printf("%nNombre: %s%nEdad: %d%nCarrera: %s%n", nombre, edad, carrera);
        }
    }
}
