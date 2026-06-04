import java.util.Scanner;

public class BuscarPalabraContains {

	// CONTAINS SE USA PARA PARA VER SI UN TEXTO CONTIENE A OTRO, POR ENDE SOLO
	// FUNCIONA CON STRING

	/*
	 * EJERCICIO: PIDE AL USUARIO QUE INGRESE UNA FRASE. LUEGO, PÍDELE UNA PALABRA Y
	 * VERIFICA SI ESA PALABRA ESTÁ CONTENIDA EN LA FRASE.
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese una frase:");
		String frase = teclado.nextLine();

		System.out.println("Ingrese la palabra a buscar:");
		String palabra = teclado.nextLine();

		boolean resultado = frase.toLowerCase().contains(palabra.toLowerCase());

		System.out.println(resultado);

		teclado.close();

	}

}
