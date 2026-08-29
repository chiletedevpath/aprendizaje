public class ResolverFloydWarshall {
    static final int INF = 1_000_000;

    static void calcular(int[][] dist) {
        for (int k = 0; k < dist.length; k++)
            for (int i = 0; i < dist.length; i++)
                for (int j = 0; j < dist.length; j++)
                    // k se evalúa como posible vértice intermedio entre i y j.
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
    }

    public static void main(String[] args) {
        int[][] d = {{0,3,INF,7},{8,0,2,INF},{5,INF,0,1},{2,INF,INF,0}};
        calcular(d);
        for (int[] fila : d) { for (int x : fila) System.out.print(x + " "); System.out.println(); }
    }
}
