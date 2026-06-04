import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarNumeroRangoRepeticion {

	/*
	 * EJERCICIO 1: ESCRIBIR UN PROGRAMA EN JAVA PARA SOLICITAR UN NÚMERO
	 * REPETIDAMENTE MIENTRAS ÉSTE SE ENCUENTRE ENTRE 1 Y 100. INGRESADO UN VALOR
	 * VÁLIDO, EL PROGRAMA CONTINÚA SI EL USUARIO RESPONDE SÍ A “¿DESEA CONTINUAR?
	 * (SÍ/NO)”. SI CONTESTA NO, EL PROGRAMA TERMINA. VALIDAR LAS DIFERENTES
	 * RESPUESTAS CON UNA EXPRESIÓN REGULAR (No, no, NO, si, Si, sí, SÍ, Sí) DENTRO
	 * DE UN BUCLE WHILE. (CLASES PATTERN & MATCHING)
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			while (true) {

				System.out.println("Ingrese un numero entre 1 y 100");
				int number = teclado.nextInt();

				if (number >= 1 && number <= 100) {

					System.out.println("¿Dese continuar? (SÍ/NO)");
					String respuesta = teclado.next();

					Pattern patron = Pattern.compile("(?i)^(si|sí|no|nó)$");
					Matcher evaluadorRespuesta = patron.matcher(respuesta);

					if (evaluadorRespuesta.matches()) {
						if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("nó")) {
							System.out.println("Programa finalizado");
							break;
						} else {
							System.out.println("Continuamos");
						}
					}
				} else {
					System.out.println("Numero fuera del rango entre 1 y 100");
				}
			}
		}
	}
}
