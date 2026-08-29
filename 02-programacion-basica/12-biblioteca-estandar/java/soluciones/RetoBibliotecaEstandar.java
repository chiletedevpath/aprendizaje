import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RetoBibliotecaEstandar {
    public static void main(String[] args) {
        LocalDate objetivo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Fecha objetivo (AAAA-MM-DD): ");
            objetivo = LocalDate.parse(scanner.nextLine().trim());
        } catch (DateTimeParseException e) {
            System.out.println("Fecha inválida. Usa el formato AAAA-MM-DD");
            return;
        }
        // ChronoUnit calcula la distancia temporal entre dos fechas.
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), objetivo);

        double a = 8.5, b = 3.2, c = 9.1;
        double mayor = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));

        System.out.printf("Faltan %d días | mínimo=%.1f | máximo=%.1f%n", dias, menor, mayor);
    }
}
