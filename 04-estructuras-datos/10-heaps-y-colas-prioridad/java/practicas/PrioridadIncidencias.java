import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioridadIncidencias {
    record Incidencia(String codigo, int prioridad, String detalle) {}
    public static void main(String[] args) {
        PriorityQueue<Incidencia> cola = new PriorityQueue<>(Comparator.comparingInt(Incidencia::prioridad));
        cola.offer(new Incidencia("I-1", 2, "Acceso"));
        cola.offer(new Incidencia("I-2", 1, "Servicio caído"));
        // El comparador convierte la prioridad de negocio en el criterio de extracción.
        while (!cola.isEmpty()) System.out.println(cola.poll());
    }
}
