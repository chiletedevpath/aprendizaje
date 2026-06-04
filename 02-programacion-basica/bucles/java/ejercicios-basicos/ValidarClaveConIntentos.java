import java.util.Scanner;

public class ValidarClaveConIntentos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String claveCorrecta = "java123";
		String claveIngresada;

		int intentos = 3;

		// Ejecuta al menos un intento y descuenta oportunidades ante claves incorrectas.
		do {
			System.out.print("Ingrese la clave: ");
			claveIngresada = teclado.nextLine();

			if (claveIngresada.equals(claveCorrecta)) {
				System.out.println("Acceso concedido");
				break;
			} else {
				intentos--;
				if (intentos > 0) {
					System.out.println("Incorrecto. Intentos restantes: " + intentos);
				}
			}

		} while (intentos > 0);

		if (intentos == 0) {
			System.out.println("Se acabaron los intentos. Cuenta bloqueada.");
		}

		teclado.close();
	}
}
