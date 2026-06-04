import java.util.Scanner;

public class Tablero {

	private char tablero[][];

	public void crearTablero() {
		tablero = new char[3][3];

		for (int i = 0; i < tablero.length; i++) { // RECORRER FILAS
			for (int j = 0; j < tablero.length; j++) { // RECORRER COLUMNAS
				tablero[i][j] = '-';
			}
		}
	}

	public void mostrarTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " "); // MUESTRA EL TABLERO
			}
			System.out.println();
		}
	}

	public void jugadaDelUsuario(Scanner teclado) {
		int fila, columna;

		do {

			do {
				System.out.print("TURNO DEL USUARIO");
				System.out.print("\nIngrese el numero de fila (1-3): ");
				fila = teclado.nextInt();
				if (fila < 1 || fila > 3) { // PARA VALIDAR LAS FILAS
					System.out.println("Debe ser un numero de fila entre 1 y 3");
				}
			} while (fila < 1 || fila > 3);
			fila--;

			do {
				System.out.print("Ingrese el numero de columna (1-3): ");
				columna = teclado.nextInt();
				if (columna < 1 || columna > 3) { // PARA VALIDAR LAS COLUMNA
					System.out.println("Debe ser un numero de columna entre 1 y 3");
				}
			} while (columna < 1 || columna > 3);
			columna--;

			if (tablero[fila][columna] != '-') {
				System.out.println("Este espacio ya esta ocupado");
			}

		} while (tablero[fila][columna] != '-');

		tablero[fila][columna] = 'O';
	}

	public void jugadaDeLaComputadora() {
		int fila, columna;

		System.out.println("TURNO DE LA COMPUTADORA");

		do {
			do {
				fila = (int) (Math.random() * 3 + 1);
			} while (fila < 1 || fila > 3);
			fila--;

			do {
				columna = (int) (Math.random() * 3 + 1);
			} while (columna < 1 || columna > 3);
			columna--;
		} while (tablero[fila][columna] != '-');

		tablero[fila][columna] = 'X';
	}

	boolean verificadorDelGanador(char jugador) {

		// TRES EN RAYAS EN FILAS
		if (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) {
			return true;
		} else if (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) {
			return true;
		} else if (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) {
			return true;
		}
		// TRES EN RAYA EN COLUMNAS
		else if (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) {
			return true;
		} else if (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) {
			return true;
		} else if (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) {
			return true;
		}
		// TRES EN RAYA EN DIAGONALES
		else if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
			return true;
		} else if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
			return true;
		} else {
			return false;
		}
	}

	boolean tableroLLeno() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == '-') {
					return true;
				}
			}
		}
		return false;
	}
}

