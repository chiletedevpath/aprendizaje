import java.util.LinkedHashMap;
import java.util.Map;

public class RetoCursos {
    public static void main(String[] args) {
// Map asocia cada curso con una cantidad de estudiantes.
        Map<String, Integer> estudiantes = new LinkedHashMap<>();
        estudiantes.put("Java", 18);
        estudiantes.put("Scala", 10);
        estudiantes.put("Web", 24);

        String mayorCurso = null;
        int mayorCantidad = -1;
        for (var entrada : estudiantes.entrySet()) {
            if (entrada.getValue() > mayorCantidad) {
                mayorCurso = entrada.getKey();
                mayorCantidad = entrada.getValue();
            }
        }
        System.out.printf("Mayor: %s (%d)%n", mayorCurso, mayorCantidad);
    }
}
