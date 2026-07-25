import java.util.Scanner;

public class CalcularDistanciaLuz {
	/*
	 * ESCRIBE UN PROGRAMA QUE CALCULE LA DISTANCIA QUE RECORRE LA LUZ EN N DÍAS,
	 * SABIENDO QUE EN UN SEGUNDO LA LUZ VIAJA A 299792458 M/S. LEER EL NÚMERO DE
	 * DÍAS UTILIZANDO LA CLASE SCANNER. CREAR UNA CONSTANTE PARA ALMACENAR LA
	 * VELOCIDAD DE LA LUZ. MUESTRA EL RESULTADO UTILIZANDO SALIDA CON FORMATO.
	 */

	public static void main(String[] args) {

		final long VELOCIDAD_LUZ_METROS_POR_SEGUNDO = 299_792_458L;
		final long SEGUNDOS_POR_DIA = 86_400L;

		System.out.println("Ingrese la cantidad de dias: ");
		try (Scanner teclado = new Scanner(System.in)) {
			int dias = teclado.nextInt();

			if (dias >= 0) {
				long segundosTotales = dias * SEGUNDOS_POR_DIA;
				long distanciaFinal = segundosTotales * VELOCIDAD_LUZ_METROS_POR_SEGUNDO;
				System.out.printf("La distancia que recorre la luz en %d dias es: %,d metros%n", dias, distanciaFinal);
			} else {
				System.out.println("La cantidad de dias no puede ser negativa.");
			}

		}

	}

}


