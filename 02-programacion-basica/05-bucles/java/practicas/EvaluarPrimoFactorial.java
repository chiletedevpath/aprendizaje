import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluarPrimoFactorial {

	public static void main(String[] args) {
		Pattern patronPrimo = Pattern.compile("^P(\\d{1,9})$", Pattern.CASE_INSENSITIVE);
		Pattern patronFactorial = Pattern.compile("^(\\d{1,2})!$");
		Pattern patronRespuesta = Pattern.compile("^(sí|si)$", Pattern.CASE_INSENSITIVE);

		// Scanner conecta el programa con la entrada estándar (teclado).

		try (Scanner teclado = new Scanner(System.in)) {
			String respuesta;

			do {
				System.out.print("Ingrese la expresión (por ejemplo, P23 o 8!): ");
				String expresion = teclado.nextLine().trim();

				Matcher validadorPrimo = patronPrimo.matcher(expresion);
				Matcher validadorFactorial = patronFactorial.matcher(expresion);

				if (validadorPrimo.matches()) {
					int numero = Integer.parseInt(validadorPrimo.group(1));
					boolean esPrimo = numero > 1;
					int divisor = 2;

					while (esPrimo && divisor <= Math.sqrt(numero)) {
						if (numero % divisor == 0) {
							esPrimo = false;
						}
						divisor++;
					}

					System.out.printf("%d %s un número primo.%n", numero, esPrimo ? "es" : "no es");
				} else if (validadorFactorial.matches()) {
					int numero = Integer.parseInt(validadorFactorial.group(1));

					if (numero > 20) {
						System.out.println("Use un número entre 0 y 20 para evitar desbordamiento.");
					} else {
						long factorial = 1;
						int factor = 2;

						while (factor <= numero) {
							factorial *= factor;
							factor++;
						}

						System.out.printf("El factorial de %d es %d.%n", numero, factorial);
					}
				} else {
					System.out.println("Formato inválido. Use Pn para primo o n! para factorial.");
				}

				System.out.print("¿Desea continuar (sí/no)?: ");
				respuesta = teclado.nextLine().trim();
				System.out.println();
			} while (patronRespuesta.matcher(respuesta).matches());

			System.out.println("Programa finalizado.");
		}
	}
}
