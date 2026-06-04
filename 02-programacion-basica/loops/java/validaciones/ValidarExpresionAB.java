import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarExpresionAB {
	/*
	 * ESCRIBIR UN PROGRAMA QUE SOLICITE UNA EXPRESIÓN DE LA FORMA AB=N DONDE A Y B
	 * SON CARACTERES A MOSTRAR EN CADA FILA DE FORMA ALTERNA, Y N ES EL NÚMERO DE
	 * FILAS A GENERAR. UTILIZAR UNA ESTRUCTURA DO-WHILE PARA VALIDAR QUE LA
	 * EXPRESIÓN CUMPLA CON EL FORMATO ESTABLECIDO. COMPROBAR EL FORMATO HACIENDO
	 * USO DE LAS CLASES PATTERN & MATCHER.
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			String expresion;
			boolean esValidada;

			do {
				System.out.println("Ingrese la expresion a validar (AB=N): ");
				expresion = teclado.nextLine();

				Pattern patronExpresion = Pattern.compile("^(?!([a-z])\\1).{2}=\\d+$");
				Matcher evaluadorExpresion = patronExpresion.matcher(expresion);

				if (evaluadorExpresion.matches()) {
					char a = expresion.charAt(0);
					char b = expresion.charAt(1);
					int n = Integer.parseInt(expresion.substring(3));

					int filas = 1;

					do {
						String cadenaFilas = "";
						int j = 0;

						do {
							if (j % 2 == 0) {
								cadenaFilas += a;
							} else {
								cadenaFilas += b;
							}
							j++;
						} while (j < filas);

						System.out.println(cadenaFilas);
						filas++;
					} while (filas <= n);
					esValidada = true;

				} else {
					esValidada = false;

					System.out.println("Formato incorrecto, usar formato AB=N");
				}
			} while (!esValidada);
		}
	}
}
