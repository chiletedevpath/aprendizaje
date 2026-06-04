public class RecorridoCaballo {

	// Matriz para evitar repetir casillas
	static boolean[][] visitado = new boolean[9][9];

	// Movimientos permitidos del caballo
	static int[][] movimientos = { { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 }, { 1, 2 }, { 1, -2 }, { -1, 2 },
			{ -1, -2 } };

	public static void main(String[] args) {
		movimiento(4, 6); // Posición inicial
	}

	public static void movimiento(int x, int y) {

		// Caso base 1: posición inválida
		if (x < 1 || x > 8 || y < 1 || y > 8) {
			System.out.println("Fuera del tablero → (" + x + "," + y + ")");
			return;
		}

		// Caso base 2: casilla ya visitada
		if (visitado[x][y]) {
			System.out.println("Casilla repetida → (" + x + "," + y + ")");
			return;
		}

		// Marcar casilla
		visitado[x][y] = true;

		// Mostrar la posición actual
		System.out.println("Visitando: (" + x + ", " + y + ")");

		// Caso recursivo: intentar los 8 movimientos
		for (int i = 0; i < movimientos.length; i++) {
			int nuevoX = x + movimientos[i][0];
			int nuevoY = y + movimientos[i][1];
			movimiento(nuevoX, nuevoY);
		}
	}
}