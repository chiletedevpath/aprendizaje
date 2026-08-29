import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class BibliotecaEstandar {
    public static void main(String[] args) {
        int[] valores = {8, 3, 12, 5};

        // La biblioteca estándar evita reimplementar operaciones comunes.
        Arrays.sort(valores);
        Random random = new Random(42); // semilla fija para obtener resultados reproducibles

        System.out.println("Raíz de 81: " + Math.sqrt(81));
        System.out.println("Fecha: " + LocalDate.now());
        System.out.println("Aleatorio reproducible: " + random.nextInt(10));
        System.out.println("Ordenados: " + Arrays.toString(valores));
    }
}
