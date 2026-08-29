import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionesBasicas {
    public static void main(String[] args) {
        // List conserva una secuencia y puede contener elementos repetidos.
        List<String> cursos = new ArrayList<>(List.of("Java", "Scala", "Java"));

        // Set representa unicidad; los duplicados de la lista desaparecen.
        Set<String> cursosUnicos = new HashSet<>(cursos);

        // Map asocia una clave con un valor.
        Map<String, Integer> avance = new HashMap<>();
        avance.put("Java", 70);
        avance.put("Scala", 25);

        System.out.println("Lista: " + cursos);
        System.out.println("Sin duplicados: " + cursosUnicos);
        System.out.println("Avance Java: " + avance.get("Java") + "%");
    }
}
