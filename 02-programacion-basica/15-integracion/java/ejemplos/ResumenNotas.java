import java.util.ArrayList;
import java.util.List;

public class ResumenNotas {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>(List.of(15, 18, 11, 20));
        double promedio = calcularPromedio(notas);
        System.out.printf("Promedio: %.2f%n", promedio);
    }

    static double calcularPromedio(List<Integer> notas) {
        if (notas.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (int nota : notas) {
            // La validación evita incluir valores fuera del dominio académico.
            if (nota < 0 || nota > 20) {
                throw new IllegalArgumentException("Nota fuera de rango: " + nota);
            }
            suma += nota;
        }
        return (double) suma / notas.size();
    }
}
