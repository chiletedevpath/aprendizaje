import java.time.LocalDate;

public class MathYFechas {
    public static void main(String[] args) {
        double valor = 81;
        // Math agrupa operaciones matemáticas de uso común.
        System.out.println("Raíz: " + Math.sqrt(valor));

        // LocalDate representa una fecha sin hora ni zona horaria.
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy: " + hoy);
    }
}
