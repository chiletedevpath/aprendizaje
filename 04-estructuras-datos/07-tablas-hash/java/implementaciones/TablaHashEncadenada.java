import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TablaHashEncadenada<K, V> {
    private record Entrada<K,V>(K clave, V valor) {}
    private final List<Entrada<K,V>>[] cubetas;

    @SuppressWarnings("unchecked")
    public TablaHashEncadenada(int capacidad) {
        cubetas = (List<Entrada<K,V>>[]) new List<?>[capacidad];
        for (int i = 0; i < capacidad; i++) cubetas[i] = new LinkedList<>();
    }

    private int indice(K clave) {
        // floorMod evita índices negativos cuando el hash de la clave es negativo.
        return Math.floorMod(Objects.hashCode(clave), cubetas.length);
    }

    public void put(K clave, V valor) {
        List<Entrada<K,V>> cubeta = cubetas[indice(clave)];
        cubeta.removeIf(e -> Objects.equals(e.clave(), clave));
        cubeta.add(new Entrada<>(clave, valor));
    }

    public V get(K clave) {
        for (Entrada<K,V> e : cubetas[indice(clave)])
            if (Objects.equals(e.clave(), clave)) return e.valor();
        return null;
    }
}
