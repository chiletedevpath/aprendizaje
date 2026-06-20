public class RecorridoCaballo {

	static boolean[][] visitado = new boolean[9][9];

	static int[][] movimientos = { { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 }, { 1, 2 }, { 1, -2 }, { -1, 2 },
			{ -1, -2 } };

	public static void main(String[] args) {
		movimiento(4, 6);
	}

	public static void movimiento(int x, int y) {

		if (x < 1 || x > 8 || y < 1 || y > 8) {
			System.out.println("Fuera del tablero -> (" + x + "," + y + ")");
			return;
		}

		if (visitado[x][y]) {
			System.out.println("Casilla repetida -> (" + x + "," + y + ")");
			return;
		}

		visitado[x][y] = true;
		System.out.println("Visitando: (" + x + ", " + y + ")");

		for (int i = 0; i < movimientos.length; i++) {
			int nuevoX = x + movimientos[i][0];
			int nuevoY = y + movimientos[i][1];
			movimiento(nuevoX, nuevoY);
		}
	}
}
