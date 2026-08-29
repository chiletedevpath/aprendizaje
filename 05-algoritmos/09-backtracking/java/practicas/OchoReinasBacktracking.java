public class OchoReinasBacktracking {

	static int[] tablero = new int[9]; // tablero[fila] = columna de la reina.
	public static void main(String[] args) {
		tablero[4] = 6; // Reina obligatoria en (4,6).

		if (posicionarReina(1)) {
			imprimirTablero();
		} else {
			System.out.println("No existe solucion con la reina fija en (4,6).");
		}
	}

	public static boolean posicionarReina(int fila) {
		if (fila == 4) {
			return posicionarReina(5);
		}

		if (fila == 9) {
			return true;
		}

		for (int col = 1; col <= 8; col++) {
			if (esValida(fila, col)) {
				tablero[fila] = col;
				if (posicionarReina(fila + 1)) {
					return true;
				}
				tablero[fila] = 0;
			}
		}
		return false;
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
		System.out.println("Solucion con reina fija en (4,6):");
		for (int fila = 1; fila <= 8; fila++) {
			System.out.println("Reina en (" + fila + "," + tablero[fila] + ")");
		}
		System.out.println("-------------------------");
	}
}
