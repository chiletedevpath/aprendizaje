import java.util.*;

public class ResolverRecorridos {
    static void bfs(Map<String,List<String>> grafo, String origen) {
        Queue<String> cola = new ArrayDeque<>();
        Set<String> visitados = new HashSet<>();
        cola.offer(origen); visitados.add(origen);
        while (!cola.isEmpty()) {
            String actual = cola.poll();
            System.out.print(actual + " ");
            for (String vecino : grafo.getOrDefault(actual, List.of())) {
                // El conjunto evita visitar varias veces el mismo vértice.
                if (visitados.add(vecino)) cola.offer(vecino);
            }
        }
    }

    public static void main(String[] args) {
        Map<String,List<String>> g = new HashMap<>();
        g.put("A", List.of("B","C")); g.put("B", List.of("D")); g.put("C", List.of("D")); g.put("D", List.of());
        bfs(g, "A");
    }
}
