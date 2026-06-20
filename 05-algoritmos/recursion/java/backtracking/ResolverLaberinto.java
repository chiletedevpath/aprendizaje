public class ResolverLaberinto {

	static int N = 5;

	// 0 = camino libre, 1 = pared.
	static int[][] laberinto = { { 0, 0, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 1, 1, 1, 0 },
			{ 0, 0, 0, 0, 0 } };

	static int[] movFila = { -1, 1, 0, 0 };
	static int[] movCol = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		boolean[][] visitado = new boolean[N][N];

		System.out.println("Buscando camino desde (0,0)...\n");

		if (resolverLaberinto(0, 0, visitado)) {
			System.out.println("\nCamino encontrado correctamente.");
		} else {
			System.out.println("\nNo existe un camino disponible.");
		}
	}

	public static boolean resolverLaberinto(int x, int y, boolean[][] visitado) {

		// Caso base: meta alcanzada.
		if (x == N - 1 && y == N - 1) {
			System.out.println("Llegamos a la salida en (" + x + "," + y + ")");
			return true;
		}

		if (esValida(x, y, visitado)) {

			System.out.println("Visitando (" + x + "," + y + ")");
			visitado[x][y] = true;

			// Explora las cuatro direcciones posibles.
			for (int i = 0; i < 4; i++) {
				int nuevoX = x + movFila[i];
				int nuevoY = y + movCol[i];

				if (resolverLaberinto(nuevoX, nuevoY, visitado)) {
					return true;
				}
			}

			// Retrocede si ninguna ruta desde esta celda llega a la salida.
			System.out.println("Retrocediendo desde (" + x + "," + y + ")");
			visitado[x][y] = false;
			return false;
		}

		return false;
	}

	public static boolean esValida(int x, int y, boolean[][] visitado) {
		return (x >= 0 && x < N && y >= 0 && y < N && laberinto[x][y] == 0 && !visitado[x][y]);
	}
}
