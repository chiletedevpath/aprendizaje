public class OchoReinasBacktracking {

	static int[] tablero = new int[9]; // tablero[fila] = columna donde está la reina
	static boolean haySolucion = false; // Bandera para verificar si se encuentra solución

	public static void main(String[] args) {

		// --- Fijar posición solicitada por el ejercicio ---
		tablero[4] = 6; // Reina obligatoria en (4,6)

		// Llamada recursiva desde la fila 1
		posicionReina(1);

		// Verificar si se encontró una solución
		if (!haySolucion) {
			System.out.println("NO EXISTE ninguna solución con la reina fija en (4,6)");
		}
	}

	// Función recursiva para colocar las reinas
	public static void posicionReina(int fila) {

		// Saltar la fila 4 porque ya tiene reina fija
		if (fila == 4) {
			posicionReina(5); // Avanzamos a la siguiente fila
			return;
		}

		// Caso base: solución completa
		if (fila == 9) {
			imprimirTablero(); // Imprimir solución encontrada
			return;
		}

		// Probar columnas 1..8
		for (int col = 1; col <= 8; col++) {

			// Mostrar intento de colocar una reina
			System.out.println("Intentando colocar reina en fila " + fila + " columna " + col);

			if (esValida(fila, col)) {
				tablero[fila] = col;
				posicionReina(fila + 1); // Llamada recursiva para la siguiente fila
			}
		}
	}

	// Verificación de ataques
	public static boolean esValida(int fila, int col) {

		for (int i = 1; i < 9; i++) {

			// Saltar filas que aún no han sido asignadas
			if (i == fila || tablero[i] == 0)
				continue;

			// Misma columna
			if (tablero[i] == col)
				return false;

			// Misma diagonal principal
			if (Math.abs(i - fila) == Math.abs(tablero[i] - col))
				return false;
		}
		return true;
	}

	// Imprime la solución cuando se encuentra
	public static void imprimirTablero() {
		haySolucion = true; // Indicar que se encontró una solución
		System.out.println("Solución con reina fija en (4,6):");
		for (int fila = 1; fila <= 8; fila++) {
			System.out.println("Reina en (" + fila + "," + tablero[fila] + ")");
		}
		System.out.println("-------------------------");
	}
}