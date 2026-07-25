public class RecorridoCaballo {

	private static final int TAMANO = 8;
	private static final int[][] MOVIMIENTOS = {
			{ 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 },
			{ 1, 2 }, { 1, -2 }, { -1, 2 }, { -1, -2 }
	};

	public static void main(String[] args) {
		int[][] recorrido = new int[TAMANO][TAMANO];
		recorrido[0][0] = 1;

		if (buscarRecorrido(0, 0, 2, recorrido)) {
			imprimir(recorrido);
		} else {
			System.out.println("No se encontro un recorrido completo.");
		}
	}

	public static boolean buscarRecorrido(int fila, int columna, int paso, int[][] recorrido) {
		if (paso > TAMANO * TAMANO) {
			return true;
		}

		int[][] candidatos = obtenerCandidatos(fila, columna, recorrido);
		for (int[] candidato : candidatos) {
			int nuevaFila = candidato[0];
			int nuevaColumna = candidato[1];

			recorrido[nuevaFila][nuevaColumna] = paso;
			if (buscarRecorrido(nuevaFila, nuevaColumna, paso + 1, recorrido)) {
				return true;
			}
			recorrido[nuevaFila][nuevaColumna] = 0;
		}
		return false;
	}

	private static int[][] obtenerCandidatos(int fila, int columna, int[][] recorrido) {
		int[][] candidatos = new int[MOVIMIENTOS.length][3];
		int cantidad = 0;

		for (int[] movimiento : MOVIMIENTOS) {
			int nuevaFila = fila + movimiento[0];
			int nuevaColumna = columna + movimiento[1];
			if (esValida(nuevaFila, nuevaColumna, recorrido)) {
				candidatos[cantidad][0] = nuevaFila;
				candidatos[cantidad][1] = nuevaColumna;
				candidatos[cantidad][2] = contarSalidas(nuevaFila, nuevaColumna, recorrido);
				cantidad++;
			}
		}

		for (int i = 0; i < cantidad - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < cantidad; j++) {
				if (candidatos[j][2] < candidatos[menor][2]) {
					menor = j;
				}
			}
			int[] temporal = candidatos[i];
			candidatos[i] = candidatos[menor];
			candidatos[menor] = temporal;
		}

		int[][] resultado = new int[cantidad][3];
		System.arraycopy(candidatos, 0, resultado, 0, cantidad);
		return resultado;
	}

	private static int contarSalidas(int fila, int columna, int[][] recorrido) {
		int salidas = 0;
		for (int[] movimiento : MOVIMIENTOS) {
			if (esValida(fila + movimiento[0], columna + movimiento[1], recorrido)) {
				salidas++;
			}
		}
		return salidas;
	}

	private static boolean esValida(int fila, int columna, int[][] recorrido) {
		return fila >= 0 && fila < TAMANO
				&& columna >= 0 && columna < TAMANO
				&& recorrido[fila][columna] == 0;
	}

	private static void imprimir(int[][] recorrido) {
		for (int[] fila : recorrido) {
			for (int paso : fila) {
				System.out.printf("%3d", paso);
			}
			System.out.println();
		}
	}
}
