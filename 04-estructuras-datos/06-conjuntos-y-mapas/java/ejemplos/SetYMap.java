import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetYMap {
    public static void main(String[] args) {
        Set<String> categorias = new HashSet<>();
        Map<String, String> estudiantes = new HashMap<>();

        // Set evita valores duplicados según sus reglas de igualdad.
        categorias.add("Backend");
        categorias.add("Backend");
        categorias.add("Datos");

        // Map relaciona una clave única con un valor.
        estudiantes.put("U001", "Ana");
        estudiantes.put("U002", "Luis");

        System.out.println(categorias);
        System.out.println(estudiantes.get("U002"));
    }
}
