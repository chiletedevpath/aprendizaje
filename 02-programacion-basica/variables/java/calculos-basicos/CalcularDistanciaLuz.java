import java.util.Scanner;

public class CalcularDistanciaLuz {
	/*
	 * ESCRIBE UN PROGRAMA QUE CALCULE LA DISTANCIA QUE RECORRE LA LUZ EN N DÍAS,
	 * SABIENDO QUE EN UN SEGUNDO LA LUZ VIAJA A 299792458 M/S. LEER EL NÚMERO DE
	 * DÍAS UTILIZANDO LA CLASE SCANNER. CREAR UNA CONSTANTE PARA ALMACENAR LA
	 * VELOCIDAD DE LA LUZ. MUESTRA EL RESULTADO UTILIZANDO SALIDA CON FORMATO.
	 */

	public static void main(String[] args) {

		final long VELOCIDADLUZ = 299792458;
		final long SEGUNDOSDIAS = 86400;

		System.out.println("Ingrese la cantidad de dias: ");
		try (Scanner teclado = new Scanner(System.in)) {
			int dia = teclado.nextInt();

			long segundosTotales = dia * SEGUNDOSDIAS;
			long distanciaFinal = segundosTotales * VELOCIDADLUZ;

			System.out.printf("La distancia que recorrio la luz en %d dias es: %d metros", dia, distanciaFinal);

		}

	}

}


