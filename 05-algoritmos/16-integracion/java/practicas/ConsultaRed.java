import java.util.*;

public class ConsultaRed {
    record Conexion(String destino, int costo) {}

    static Map<String,Integer> dijkstra(Map<String,List<Conexion>> g, String origen) {
        Map<String,Integer> dist = new HashMap<>();
        for (String v : g.keySet()) dist.put(v, Integer.MAX_VALUE);
        dist.put(origen, 0);
        PriorityQueue<Conexion> pq = new PriorityQueue<>(Comparator.comparingInt(Conexion::costo));
        pq.offer(new Conexion(origen, 0));
        while (!pq.isEmpty()) {
            Conexion actual = pq.poll();
            if (actual.costo() != dist.get(actual.destino())) continue;
            for (Conexion arista : g.getOrDefault(actual.destino(), List.of())) {
                int nueva = actual.costo() + arista.costo();
                if (nueva < dist.get(arista.destino())) {
                    // Relajar una arista significa mejorar la mejor distancia conocida.
                    dist.put(arista.destino(), nueva);
                    pq.offer(new Conexion(arista.destino(), nueva));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Map<String,List<Conexion>> g = new HashMap<>();
        g.put("Chilete", List.of(new Conexion("Cajamarca", 95), new Conexion("Tembladera", 35)));
        g.put("Tembladera", List.of(new Conexion("Cajamarca", 50)));
        g.put("Cajamarca", List.of());
        System.out.println(dijkstra(g, "Chilete"));
    }
}
