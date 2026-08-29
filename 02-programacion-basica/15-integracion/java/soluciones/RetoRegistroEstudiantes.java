import java.util.ArrayList;
import java.util.List;

public class RetoRegistroEstudiantes {
    public static void main(String[] args) {
// Las listas paralelas mantienen relacionados nombre y nota por posición.
        List<String> nombres = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();

        registrar(nombres, notas, "Ana", 18);
        registrar(nombres, notas, "Luis", 14);
        registrar(nombres, notas, "María", 11);

        listar(nombres, notas);
        System.out.printf("Promedio: %.2f%n", promedio(notas));
    }

    static void registrar(List<String> nombres, List<Integer> notas, String nombre, int nota) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        if (nota < 0 || nota > 20) throw new IllegalArgumentException("Nota fuera de rango");
        nombres.add(nombre.trim());
        notas.add(nota);
    }

    static void listar(List<String> nombres, List<Integer> notas) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%s -> %d%n", nombres.get(i), notas.get(i));
        }
    }

    static double promedio(List<Integer> notas) {
        if (notas.isEmpty()) return 0;
        int suma = 0;
        for (int nota : notas) suma += nota;
        return (double) suma / notas.size();
    }
}
