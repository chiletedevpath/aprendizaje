import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidarNumeroRangoRepeticion {

	public static void main(String[] args) {
		Pattern patronRespuesta = Pattern.compile("^(sí|si|no)$", Pattern.CASE_INSENSITIVE);

		try (Scanner teclado = new Scanner(System.in)) {
			boolean continuar = true;

			while (continuar) {
				System.out.print("Ingrese un número entre 1 y 100: ");
				int numero = teclado.nextInt();
				teclado.nextLine();

				if (numero < 1 || numero > 100) {
					System.out.println("Número fuera del rango entre 1 y 100.");
					continue;
				}

				String respuesta;
				do {
					System.out.print("¿Desea continuar (sí/no)?: ");
					respuesta = teclado.nextLine().trim();

					if (!patronRespuesta.matcher(respuesta).matches()) {
						System.out.println("Respuesta inválida. Escriba sí o no.");
					}
				} while (!patronRespuesta.matcher(respuesta).matches());

				continuar = !respuesta.equalsIgnoreCase("no");
			}

			System.out.println("Programa finalizado.");
		}
	}
}
