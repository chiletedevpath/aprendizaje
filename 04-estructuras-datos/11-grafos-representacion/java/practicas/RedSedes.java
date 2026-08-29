import java.util.*;

public class RedSedes {
    public static void main(String[] args) {
        Map<String, Set<String>> red = new LinkedHashMap<>();
        conectar(red, "Chilete", "Cajamarca");
        conectar(red, "Chilete", "Trujillo");
        conectar(red, "Cajamarca", "Lima");
        System.out.println(red);
    }
    static void conectar(Map<String, Set<String>> red, String a, String b) {
        // computeIfAbsent crea el conjunto solo cuando el vértice todavía no existe.
        red.computeIfAbsent(a, k -> new LinkedHashSet<>()).add(b);
        red.computeIfAbsent(b, k -> new LinkedHashSet<>()).add(a);
    }
}
