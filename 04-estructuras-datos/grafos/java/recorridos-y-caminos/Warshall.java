public class Warshall {

	// Ejecuta Warshall sobre una matriz de adyacencia.
	public static void warshall(int[][] M) {

		int n = M.length; // Numero de nodos.

		// Evalua cada nodo como punto intermedio.
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					// Si existe camino i->k y k->j, entonces existe i->j.
					M[i][j] = (M[i][j] == 1) || (M[i][k] == 1 && M[k][j] == 1) ? 1 : 0;
				}
			}
		}
	}

	// Imprime la matriz resultante.
	public static void imprimir(int[][] M) {
		for (int[] fila : M) {
			for (int x : fila) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	// Programa principal para probar el algoritmo.
	public static void main(String[] args) {

		// Matriz inicial de adyacencia.
		int[][] matriz = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 } };

		System.out.println("Matriz original:");
		imprimir(matriz);

		warshall(matriz);

		System.out.println("\nMatriz final (caminos alcanzables):");
		imprimir(matriz);
	}
}
