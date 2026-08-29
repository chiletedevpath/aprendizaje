import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaAdyacencia {
    public static void main(String[] args) {
        Map<String, List<String>> grafo = new HashMap<>();

        // Cada clave representa un vértice y su lista almacena los vecinos directos.
        grafo.computeIfAbsent("Chilete", k -> new ArrayList<>()).add("Cajamarca");
        grafo.computeIfAbsent("Chilete", k -> new ArrayList<>()).add("Trujillo");
        grafo.computeIfAbsent("Cajamarca", k -> new ArrayList<>()).add("Chilete");

        System.out.println("Vecinos de Chilete: " + grafo.get("Chilete"));
    }
}
