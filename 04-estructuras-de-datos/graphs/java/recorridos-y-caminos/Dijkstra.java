import java.util.Arrays;

public class Dijkstra {

	// METODO PARA EJECUTAR DIJKSTRA DESDE UN ORIGEN
	public static void dijkstra(int[][] grafo, int origen) {

		int n = grafo.length; // NUMERO DE NODOS

		int[] distancia = new int[n]; // GUARDO DISTANCIAS MINIMAS
		boolean[] visitado = new boolean[n]; // PARA SABER QUE NODOS YA SE PROCESARON

		// INICIALIZO TODAS LAS DISTANCIAS EN "INFINITO"
		Arrays.fill(distancia, Integer.MAX_VALUE);

		distancia[origen] = 0; // EL ORIGEN SIEMPRE VALE 0

		// REPITO N-1 VECES PARA IR MEJORANDO LOS CAMINOS
		for (int i = 0; i < n - 1; i++) {

			// BUSCO EL NODO MAS CERCANO QUE NO ESTE VISITADO
			int min = -1;
			for (int j = 0; j < n; j++) {
				if (!visitado[j] && (min == -1 || distancia[j] < distancia[min])) {
					min = j;
				}
			}

			visitado[min] = true; // YA PROCESE ESTE NODO

			// ACTUALIZO SUS VECINOS (SI MEJORAN LA DISTANCIA LA CAMBIO)
			for (int j = 0; j < n; j++) {
				if (grafo[min][j] > 0 && distancia[min] + grafo[min][j] < distancia[j]) {
					distancia[j] = distancia[min] + grafo[min][j];
				}
			}
		}

		// IMPRIMO RESULTADOS FINALES
		System.out.println("DISTANCIAS MINIMAS DESDE EL NODO " + origen + ":");
		for (int i = 0; i < n; i++) {
			System.out.println("A " + i + " = " + distancia[i]);
		}
	}

	// ============================================================
	// PROGRAMA PRINCIPAL PARA PROBAR EL ALGORITMO DE DIJKSTRA
	// ============================================================
	public static void main(String[] args) {

		// MATRIZ DE ADYACENCIA CON PESOS
		// PUEDO CAMBIAR ESTOS VALORES PARA PROBARLO
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

		// PRUEBA DESDE EL NODO 0 (A)
		dijkstra(grafo, 0); // 0 ES A, PERO PUEDO PONER 1 PARA B ETC.
	}
}