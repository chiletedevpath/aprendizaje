import java.util.Scanner;

public class JuegoTresEnRaya {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("JUEGO DE TRES EN RAYA EN CONSOLA\n");

			System.out.println("Usuario: O");
			System.out.println("Computadora: X\n");

			Tablero juego = new Tablero();

			System.out.println("QUE GANE EL MEJOR\n");
			juego.crearTablero();
			juego.mostrarTablero();

			boolean juegoTerminado = false;

			while (!juegoTerminado) {
				System.out.println();
				juego.jugadaDelUsuario(teclado);
				juego.mostrarTablero();

				if (juego.verificarGanador('O')) {
					System.out.println("El ganador es el usuario.");
					juegoTerminado = true;
				} else if (!juego.hayEspaciosDisponibles()) {
					System.out.println("Hay empate.");
					juegoTerminado = true;
				} else {
					System.out.println();
					juego.jugadaDeLaComputadora();
					juego.mostrarTablero();

					if (juego.verificarGanador('X')) {
						System.out.println("El ganador es la computadora.");
						juegoTerminado = true;
					} else if (!juego.hayEspaciosDisponibles()) {
						System.out.println("Hay empate.");
						juegoTerminado = true;
					}
				}
			}
		}
	}
}

