import java.util.ArrayDeque;
import java.util.Deque;

public class PilaConDeque {
    public static void main(String[] args) {
        Deque<String> historial = new ArrayDeque<>();

        // push coloca el elemento en la parte superior de la pila.
        historial.push("Inicio");
        historial.push("Cursos");
        historial.push("Java");

        // pop retira el último elemento que ingresó: comportamiento LIFO.
        System.out.println("Volver desde: " + historial.pop());
        System.out.println("Página actual: " + historial.peek());
    }
}
