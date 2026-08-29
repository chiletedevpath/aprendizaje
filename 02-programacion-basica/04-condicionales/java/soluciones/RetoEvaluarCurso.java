import java.util.Scanner;

public class RetoEvaluarCurso {
    public static void main(String[] args) {
        int nota;
        int asistencia;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nota (0-20): ");
            nota = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Asistencia (0-100): ");
            asistencia = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar números enteros");
            return;
        }

        // Primero se valida el dominio para no clasificar entradas inválidas.
        if (nota < 0 || nota > 20 || asistencia < 0 || asistencia > 100) {
            System.out.println("Datos fuera de rango");
        } else if (asistencia < 70) {
            System.out.println("Desaprobado por asistencia");
        } else if (nota < 11) {
            System.out.println("Desaprobado por nota");
        } else {
            System.out.println("Aprobado");
        }
    }
}
