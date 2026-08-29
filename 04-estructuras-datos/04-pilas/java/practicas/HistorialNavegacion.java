import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialNavegacion {
    public static void main(String[] args) {
        Deque<String> historial = new ArrayDeque<>();
        historial.push("/inicio");
        historial.push("/ruta");
        historial.push("/java");

        // pop recupera la página anterior eliminando la posición actual.
        String actual = historial.pop();
        System.out.println("Salir de: " + actual);
        System.out.println("Volver a: " + historial.peek());
    }
}
