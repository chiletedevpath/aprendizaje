import java.util.Scanner;

public class PiedraPapelTijeraAleatorio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 3);
		String computadora = "";

		if (aleatorio == 0) {
			computadora = "piedra";
		} else if (aleatorio == 1) {
			computadora = "papel";
		} else {
			computadora = "tijeras";
		}

		System.out.print("Elige piedra, papel o tijeras: ");
		String usuario = scanner.nextLine().toLowerCase();

		if (usuario.equals("tijera")) {
			usuario = "tijeras";
		}

		if (!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijeras")) {
			System.out.println("Esa opción no es válida.");
			scanner.close();
			return;
		}

		System.out.println("Tú elegiste: " + usuario);
		System.out.println("La computadora eligió: " + computadora);

		if (usuario.equals(computadora)) {
			System.out.println("¡Empate!");
		} else if ((usuario.equals("piedra") && computadora.equals("tijeras"))
				|| (usuario.equals("tijeras") && computadora.equals("papel"))
				|| (usuario.equals("papel") && computadora.equals("piedra"))) {
			System.out.println("¡Ganaste!");
		} else {
			System.out.println("¡Perdiste!");
		}

		scanner.close();
	}
}