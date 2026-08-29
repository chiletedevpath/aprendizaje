import java.util.Comparator;
import java.util.PriorityQueue;

public class ColaPrioridad {
    record Incidencia(String codigo, int prioridad) {}

    public static void main(String[] args) {
        PriorityQueue<Incidencia> cola = new PriorityQueue<>(Comparator.comparingInt(Incidencia::prioridad));

        // PriorityQueue entrega primero el elemento que cumple el criterio de mayor prioridad.
        cola.offer(new Incidencia("INC-003", 3));
        cola.offer(new Incidencia("INC-001", 1));
        cola.offer(new Incidencia("INC-002", 2));

        System.out.println("Atender primero: " + cola.poll());
    }
}
