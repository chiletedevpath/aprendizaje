import java.time.LocalDateTime;

public class DemostracionFormatoPrint {

	public static void main(String[] args) {

		// Secuencias de escape con println.
		System.out.println("Primera linea\nSegunda linea");
		System.out.println("\tTexto con tabulacion");
		System.out.println("\"Chilete DevPath\"");
		System.out.println("Ruta de ejemplo: C:\\aprendizaje\\java");

		// Formatos con printf.

		double value = 142587.250478;
		LocalDateTime today = LocalDateTime.now();

		System.out.printf("Simbolo de porcentaje: %%%n");

		/*
		 * %x CONVIERTE UN NÚMERO ENTERO A SU REPRESENTACIÓN HEXADECIMAL %n
		 * ESPECIFICADOR DE SALTO DE LÍNEA
		 */

		System.out.printf("Parte entera en hexadecimal: %x%n", (int) value);

		/*
		 * OJO: PARA IMPRIMIR LA FECHA Y HORA LOCAL, SE DEBE IMPORTAR LA LIBRERIA Date
		 * tD IMPRIME LA FECHA EN FORMATO MM/DD/YY
		 * tT IMPRIME LA HORA EN FORMATO
		 * HH:MM:SS
		 */

		System.out.printf("Fecha y hora: %tD - %tT%n", today, today);

		/*
		 * %o CONVIERTE UN NÚMERO ENTERO A SU REPRESENTACIÓN OCTAL
		 */
		System.out.printf("Parte entera en octal: %o%n", (int) value);

		// %f IMPRIME UN NÚMERO DE PUNTO FLOTANTE (NÚMEROS CON DECIMALES, COMO FLOAT O
		// DOUBLE

		System.out.printf("Valor decimal con dos cifras: %.2f%n", value);

	}

}
