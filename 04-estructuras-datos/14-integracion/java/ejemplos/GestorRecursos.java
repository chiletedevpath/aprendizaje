import java.util.*;

public class GestorRecursos {
    record Recurso(String codigo, String titulo, String categoria) {}
    record Solicitud(String codigoRecurso, int prioridad) {}

    public static void main(String[] args) {
        List<Recurso> recursos = new ArrayList<>();
        Map<String, Recurso> porCodigo = new HashMap<>();
        Set<String> categorias = new HashSet<>();
        PriorityQueue<Solicitud> solicitudes = new PriorityQueue<>(Comparator.comparingInt(Solicitud::prioridad));

        Recurso recurso = new Recurso("R-001", "Guía de Java", "Programación");
        recursos.add(recurso);                    // List conserva el catálogo principal.
        porCodigo.put(recurso.codigo(), recurso); // Map funciona como índice por código.
        categorias.add(recurso.categoria());      // Set evita categorías repetidas.
        solicitudes.offer(new Solicitud("R-001", 1)); // PriorityQueue ordena las solicitudes por prioridad.

        System.out.println("Recurso: " + porCodigo.get("R-001"));
        System.out.println("Solicitud: " + solicitudes.poll());
    }
}
