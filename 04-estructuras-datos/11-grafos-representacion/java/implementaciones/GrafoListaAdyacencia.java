import java.util.*;

public class GrafoListaAdyacencia {
    private final Map<String, Set<String>> adyacencias = new HashMap<>();

    public void agregarVertice(String vertice) {
        adyacencias.computeIfAbsent(vertice, k -> new LinkedHashSet<>());
    }

    public void conectar(String a, String b) {
        agregarVertice(a); agregarVertice(b);
        // En un grafo no dirigido cada arista se registra en ambos sentidos.
        adyacencias.get(a).add(b);
        adyacencias.get(b).add(a);
    }

    public Set<String> vecinos(String vertice) {
        return Collections.unmodifiableSet(adyacencias.getOrDefault(vertice, Set.of()));
    }
}
