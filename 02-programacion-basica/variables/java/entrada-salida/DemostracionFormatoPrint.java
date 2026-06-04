import java.time.LocalDateTime;

public class DemostracionFormatoPrint {

	public static void main(String[] args) {

		// PRACTICA DE System.out.println()

		System.out.println("\n\t\"Steve Jobs\" announced the \niPhone in 2007.");
		System.out.println("");

		System.out.println("\\Hola Mundo, esto es una prueba funciono?");
		System.out.println("");

		// OJO: ESTE FUNCIONALIDAD PUEDE QUE NO FUNCIONE EN EL IDE PERO SI EN CMD
		System.out.println("Hola Mundo\r, esto es una prueba ... funciono si o\r no?");
		System.out.println("");

		System.out.println("Hola Mundo\n, esto es una prueba ... funciono si o\n no?");
		System.out.println("");

		// PRACTICA DE System.out.printf()

		double value = 142587.250478;
		LocalDateTime today = LocalDateTime.now();

		System.out.printf("%%%n");
		System.out.println("");

		/*
		 * %x CONVIERTE UN NÚMERO ENTERO A SU REPRESENTACIÓN HEXADECIMAL %n
		 * ESPECIFICADOR DE SALTO DE LÍNEA
		 */

		System.out.printf("%x%n", (int) value);
		System.out.println("");

		/*
		 * OJO: PARA IMPRIMIR LA FECHA Y HORA LOCAL, SE DEBE IMPORTAR LA LIBRERIA Date
		 * tD IMPRIME LA FECHA EN FORMATO MM/DD/YY
		 * tT IMPRIME LA HORA EN FORMATO
		 * HH:MM:SS
		 */

		System.out.printf("%tD - %tT%n", today, today);
		System.out.println("");

		/*
		 * %o CONVIERTE UN NÚMERO ENTERO A SU REPRESENTACIÓN OCTAL
		 */
		System.out.printf("%o%n", (int) value);
		System.out.println("");

		// %f IMPRIME UN NÚMERO DE PUNTO FLOTANTE (NÚMEROS CON DECIMALES, COMO FLOAT O
		// DOUBLE

		System.out.printf("%f%n", value);
		System.out.println("");
		
		
		

	}

}
