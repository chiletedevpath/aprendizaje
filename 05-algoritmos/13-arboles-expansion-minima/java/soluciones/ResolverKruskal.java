import java.util.*;

public class ResolverKruskal {
    record Arista(int u, int v, int peso) {}

    static class UnionFind {
        int[] padre;
        UnionFind(int n) { padre = new int[n]; for (int i=0;i<n;i++) padre[i]=i; }
        int find(int x) { return padre[x] == x ? x : (padre[x] = find(padre[x])); }
        boolean unir(int a, int b) {
            int ra = find(a), rb = find(b);
            if (ra == rb) return false;
            // Unir componentes distintos evita formar un ciclo.
            padre[rb] = ra;
            return true;
        }
    }

    public static void main(String[] args) {
        List<Arista> aristas = new ArrayList<>(List.of(new Arista(0,1,4), new Arista(0,2,1), new Arista(2,1,2), new Arista(1,3,1), new Arista(2,3,5)));
        aristas.sort(Comparator.comparingInt(Arista::peso));
        UnionFind uf = new UnionFind(4); int costo = 0;
        for (Arista a : aristas) if (uf.unir(a.u(), a.v())) { System.out.println(a); costo += a.peso(); }
        System.out.println("Costo: " + costo);
    }
}
