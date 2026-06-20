public class OchoReinasBacktracking {

	static int[] tablero = new int[9]; // tablero[fila] = columna de la reina.
	static boolean haySolucion = false;

	public static void main(String[] args) {

		tablero[4] = 6; // Reina obligatoria en (4,6).

		posicionReina(1);

		if (!haySolucion) {
			System.out.println("No existe solucion con la reina fija en (4,6).");
		}
	}

	public static void posicionReina(int fila) {

		if (fila == 4) {
			posicionReina(5);
			return;
		}

		if (fila == 9) {
			imprimirTablero();
			return;
		}

		for (int col = 1; col <= 8; col++) {
			System.out.println("Intentando colocar reina en fila " + fila + " columna " + col);

			if (esValida(fila, col)) {
				tablero[fila] = col;
				posicionReina(fila + 1);
			}
		}
	}

	public static boolean esValida(int fila, int col) {

		for (int i = 1; i < 9; i++) {
			if (i == fila || tablero[i] == 0) {
				continue;
			}

			if (tablero[i] == col) {
				return false;
			}

			if (Math.abs(i - fila) == Math.abs(tablero[i] - col)) {
				return false;
			}
		}
		return true;
	}

	public static void imprimirTablero() {
		haySolucion = true;
		System.out.println("Solucion con reina fija en (4,6):");
		for (int fila = 1; fila <= 8; fila++) {
			System.out.println("Reina en (" + fila + "," + tablero[fila] + ")");
		}
		System.out.println("-------------------------");
	}
}
