public class Warshall {

	// METODO PARA EJECUTAR WARSHALL
	public static void warshall(int[][] M) {

		int n = M.length; // GUARDO EL NUMERO DE NODOS

		// RECORRO CADA NODO COMO INTERMEDIO K
		for (int k = 0; k < n; k++) {

			// RECORRO LAS FILAS I
			for (int i = 0; i < n; i++) {

				// RECORRO LAS COLUMNAS J
				for (int j = 0; j < n; j++) {

					// APLICO LA FORMULA DE WARSHALL
					// SI EXISTE CAMINO i->k Y k->j ENTONCES EXISTE i->j
					M[i][j] = (M[i][j] == 1) || (M[i][k] == 1 && M[k][j] == 1) ? 1 : 0;
				}
			}
		}
	}

	// METODO PARA IMPRIMIR LA MATRIZ
	public static void imprimir(int[][] M) {
		for (int[] fila : M) {
			for (int x : fila) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	// ===========================================================
	// PROGRAMA PRINCIPAL PARA PROBAR EL ALGORITMO
	// ===========================================================
	public static void main(String[] args) {

		// MATRIZ INICIAL DE ADYACENCIA
		// ESTA SE PUEDE CAMBIAR PARA PROBAR CON OTROS GRAFOS
		int[][] matriz = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 } };

		System.out.println("MATRIZ ORIGINAL:");
		imprimir(matriz);

		// LLAMO A WARSHALL
		warshall(matriz);

		System.out.println("\nMATRIZ FINAL (CAMINOS ALCANZABLES):");
		imprimir(matriz);
	}
}