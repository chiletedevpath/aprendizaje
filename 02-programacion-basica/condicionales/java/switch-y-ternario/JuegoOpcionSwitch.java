import java.util.Scanner;

public class JuegoOpcionSwitch {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Marque una opcion: ");
			int numero = scanner.nextInt();

			switch (numero) {
			case 1:
				System.out.println("Ganador");
				break;
			case 2:
				System.out.println("casi casi");
				break;
			case 3:
				System.out.println("por poquito");
				break;
			default:
				System.out.println("PERDISTES");
				break;
			}

		}
	}

}
