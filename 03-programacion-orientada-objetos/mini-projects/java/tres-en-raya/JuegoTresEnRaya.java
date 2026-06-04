import java.util.Scanner;

public class JuegoTresEnRaya {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("JUEGO DE TRES EN RAYA EN CONSOLA\n");

		System.out.println("Usuario: O");
		System.out.println("Computadora: X\n");

		Tablero juego = new Tablero();

		System.out.println("QUE GANE EL MEJOR\n");
		juego.crearTablero();
		juego.mostrarTablero();
		

		do {
			System.out.println("");
			juego.jugadaDelUsuario(teclado);
			juego.mostrarTablero();

			boolean resultadoDelJuego = juego.verificadorDelGanador('O');
			if (resultadoDelJuego == true) {
				System.out.println("El ganador es el usuario");
				break;
			}
			
			resultadoDelJuego = juego.tableroLLeno();
			if (resultadoDelJuego == false) {
				System.out.println("Hay empate");
				break;
			}
				
			System.out.println("");
			juego.jugadaDeLaComputadora();
			juego.mostrarTablero();
			resultadoDelJuego = juego.verificadorDelGanador('X');
			if (resultadoDelJuego == true) {
				System.out.println("El ganador es la computadora");
				break;
			}

		} while (true);
	}
}

