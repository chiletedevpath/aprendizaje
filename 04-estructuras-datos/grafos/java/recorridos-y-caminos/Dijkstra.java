import java.util.Arrays;

public class Dijkstra {

	// Ejecuta Dijkstra desde un nodo de origen.
	public static void dijkstra(int[][] grafo, int origen) {

		int n = grafo.length; // Numero de nodos.

		int[] distancia = new int[n]; // Distancias minimas acumuladas.
		boolean[] visitado = new boolean[n]; // Nodos ya procesados.

		// Inicializa todas las distancias como no alcanzadas.
		Arrays.fill(distancia, Integer.MAX_VALUE);

		distancia[origen] = 0; // El origen siempre vale 0.

		// Repite n-1 veces para mejorar las rutas disponibles.
		for (int i = 0; i < n - 1; i++) {

			// Busca el nodo no visitado con menor distancia acumulada.
			int min = -1;
			for (int j = 0; j < n; j++) {
				if (!visitado[j] && (min == -1 || distancia[j] < distancia[min])) {
					min = j;
				}
			}

			visitado[min] = true; // Marca el nodo como procesado.

			// Actualiza vecinos si se encuentra una distancia menor.
			for (int j = 0; j < n; j++) {
				if (grafo[min][j] > 0 && distancia[min] + grafo[min][j] < distancia[j]) {
					distancia[j] = distancia[min] + grafo[min][j];
				}
			}
		}

		System.out.println("Distancias minimas desde el nodo " + origen + ":");
		for (int i = 0; i < n; i++) {
			System.out.println("A " + i + " = " + distancia[i]);
		}
	}

	// Programa principal para probar el algoritmo de Dijkstra.
	public static void main(String[] args) {

		// Matriz de adyacencia con pesos.
		int[][] grafo = { { 0, 6, 0, 10, 0, 0, 8, 0, 0 }, // A
				{ 6, 0, 11, 0, 15, 0, 0, 13, 0 }, // B
				{ 0, 11, 0, 0, 0, 0, 0, 4, 0 }, // C
				{ 10, 0, 0, 0, 6, 0, 0, 0, 0 }, // D
				{ 0, 15, 0, 6, 0, 2, 6, 0, 0 }, // E
				{ 0, 0, 0, 0, 2, 0, 4, 0, 6 }, // F
				{ 8, 0, 0, 0, 6, 4, 0, 5, 5 }, // G
				{ 0, 13, 4, 0, 0, 0, 5, 0, 7 }, // H
				{ 0, 0, 0, 0, 0, 6, 5, 7, 0 } // I
		};

		dijkstra(grafo, 0); // 0 representa A.
	}
}
