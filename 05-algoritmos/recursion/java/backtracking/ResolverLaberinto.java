public class ResolverLaberinto {

	// Tamaño del laberinto (matriz NxN)
	static int N = 5;

	// Matriz del laberinto:
	// 0 = camino libre
	// 1 = pared / bloqueado
	static int[][] laberinto = { { 0, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0 } };

	// Movimientos posibles: arriba, abajo, izquierda, derecha
	static int[] movFila = { -1, 1, 0, 0 };
	static int[] movCol = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		// Matriz auxiliar para marcar qué celdas ya hemos visitado
		boolean[][] visitado = new boolean[N][N];

		System.out.println("Buscando camino desde (0,0)...\n");

		// Iniciamos la búsqueda recursiva desde la celda inicial
		if (resolverLaberinto(0, 0, visitado)) {
			System.out.println("\n¡Camino encontrado correctamente!");
		} else {
			System.out.println("\nNo existe un camino disponible.");
		}
	}

	public static boolean resolverLaberinto(int x, int y, boolean[][] visitado) {

		// ============================================
		// CASO BASE:
		// Si llegamos a la última celda: meta alcanzada
		// ============================================
		if (x == N - 1 && y == N - 1) {
			System.out.println("Llegamos a la salida en (" + x + "," + y + ")");
			return true;
		}

		// ============================================
		// VALIDACIÓN:
		// Verificar que la celda sea válida para avanzar
		// ============================================
		if (esValida(x, y, visitado)) {

			System.out.println("Visitando (" + x + "," + y + ")");
			visitado[x][y] = true; // Marcamos como visitada antes de recursar

			// ============================================
			// CASO RECURSIVO:
			// Intentamos movernos en las 4 direcciones
			// ============================================
			for (int i = 0; i < 4; i++) {
				int nuevoX = x + movFila[i];
				int nuevoY = y + movCol[i];

				// Llamada recursiva
				if (resolverLaberinto(nuevoX, nuevoY, visitado)) {
					return true; // Si desde el siguiente paso se llega, TODO es true
				}
			}

			// ============================================
			// BACKTRACKING:
			// No funcionó ningún camino: Retrocedemos
			// ============================================
			System.out.println("Retrocediendo desde (" + x + "," + y + ")");
			visitado[x][y] = false; // desmarcamos la celda
			return false;
		}

		// Si no es válida, simplemente no se puede usar esta celda
		return false;
	}

	// --------------------------------------------
	// 4. Función que verifica si una celda es válida
	// --------------------------------------------
	public static boolean esValida(int x, int y, boolean[][] visitado) {

		// La celda es válida si:
		// - Está dentro de la matriz
		// - Es un camino libre (0)
		// - NO ha sido visitada antes
		return (x >= 0 && x < N && y >= 0 && y < N && laberinto[x][y] == 0 && !visitado[x][y]);
	}
}
