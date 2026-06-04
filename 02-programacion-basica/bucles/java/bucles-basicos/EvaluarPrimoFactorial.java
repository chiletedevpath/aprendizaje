import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluarPrimoFactorial {

	/*
	 * ESCRIBIR UN PROGRAMA QUE LEA UNA EXPRESIÓN Y QUE: DETERMINE SI UN NÚMERO ES O
	 * NO PRIMO, PARA LO CUAL SE DEBE INGRESAR EL NÚMERO CON EL PREFIJO “P”
	 * (EJEMPLO: P23) HALLE LA FACTORIAL DE UN NÚMERO, PARA LO CUAL SE DEBE INGRESAR
	 * EL NÚMERO CON EL SUFIJO “!” (EJEMPLO: 8!). LUEGO DE MOSTRAR EL RESULTADO DE
	 * LA EXPRESIÓN INGRESADA, EL PROGRAMA TERMINA SI USUARIO RESPONDE “NO” A LA
	 * PREGUNTA “¿DESEA CONTINUAR (SI/NO)?”. USAR DO-WHILE PARA VALIDACIONES Y
	 * PATTERN & MATCHER PARA EVALUAR EL FORMATO DE LA EXPRESIÓN INGRESADA.
	 * 
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			Pattern patronRespuesta = Pattern.compile("(?i)^(si|SI|sí|SÍ)$");
			String respuesta;

			do {
				System.out.print("Ingrese la expresión (Ej: P23 o 8!): ");
				String expresion = teclado.nextLine().toUpperCase();

				Pattern patronExpresion = Pattern.compile("^P(\\d+)$");
				Pattern patronFactorial = Pattern.compile("^(\\d+)!$");

				Matcher validadorExpresion = patronExpresion.matcher(expresion);
				Matcher validadorFactorial = patronFactorial.matcher(expresion);

				if (validadorExpresion.matches()) {
					int numeroExpresion = Integer.parseInt(validadorExpresion.group(1));

					boolean es_numeroPrimo = true;

					if (numeroExpresion <= 1) {
						es_numeroPrimo = false;
					} else {
						int i = 2;
						while (i <= Math.sqrt(numeroExpresion)) { // SERIA MEJOR CON FOR PERO CON WHILE TAMBIEN BIEN
							if (numeroExpresion % i == 0) {
								es_numeroPrimo = false;
							}
							i++;
						}
					}

					if (es_numeroPrimo) {
						System.out.printf("El numero %d es numero primo\n", numeroExpresion);
					} else {
						System.out.printf("El numero %d no es numero primo\n", numeroExpresion);
					}
				}

				if (validadorFactorial.matches()) {
					int numeroFactorial = Integer.parseInt(validadorFactorial.group(1));

					int j = 1;
					int productoFactorial = 1;

					while (j <= numeroFactorial) {
						productoFactorial *= j;
						j++;
					}
					System.out.printf("El factorial de %d es %d\n", numeroFactorial, productoFactorial);
					System.out.println();
				}

				System.out.print("¿Desea continuar (si o no)?:");
				respuesta = teclado.nextLine();
				System.out.println();

			} while (patronRespuesta.matcher(respuesta).matches()); // ME DIO PROBLEMAS
			System.out.println("Programa finalizado.");
		}
	}
}
