import java.util.*;

public class GestionInscripciones {
    record Inscripcion(String estudiante, String curso) {}
    public static void main(String[] args) {
        List<Inscripcion> orden = new ArrayList<>();
        Map<String, List<Inscripcion>> porEstudiante = new HashMap<>();
        Set<String> cursos = new HashSet<>();

        Inscripcion i = new Inscripcion("U001", "JAVA-01");
        orden.add(i);
        porEstudiante.computeIfAbsent(i.estudiante(), k -> new ArrayList<>()).add(i);
        cursos.add(i.curso());

        // La combinación evita exigir a una sola estructura operaciones incompatibles entre sí.
        System.out.println(orden);
        System.out.println(porEstudiante.get("U001"));
        System.out.println(cursos);
    }
}
