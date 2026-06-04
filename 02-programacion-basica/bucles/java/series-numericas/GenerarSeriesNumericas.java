import java.util.Scanner;

public class GenerarSeriesNumericas {
	/*
	 * ESCRIBIR UN PROGRAMA EN JAVA PARA MOSTRAR LOS N PRIMEROS NÚMEROS DE UNA
	 * PROGRESIÓN ARITMÉTICA O GEOMÉTRICA. EL USUARIO DETERMINA EL TIPO DE
	 * PROGRESIÓN, Y PROPORCIONA EL VALOR INICIAL, LA RAZÓN Y EL NÚMERO DE TÉRMINOS
	 * A GENERAR. LA SERIE DE NÚMEROS DEBE ACUMULARSE EN UNA CADENA UTILIZANDO
	 * STRING.FORMAT() ANTES DE MOSTRAR LA PROGRESIÓN. *
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			int opcion;
			do {
				System.out.println("");
				String menu = """
						Eliga el tipo de progresion a realizar:
						[1] ARITMÉTICA
						[2] GEOMÉTRICA
						[3] SALIR
						=======================================
						Ingrese una opción: """;

				System.out.println(menu);
				opcion = teclado.nextInt();

				if (opcion == 1 || opcion == 2) {
					String tipoProgresion = (opcion == 1) ? "aritmética" : "geométrica";
					String cadenaProgresion = "";

					System.out.println("");

					System.out.printf("Ingrese el valor inicial de la progresion %s: ", tipoProgresion);
					double valorInicial = teclado.nextDouble();

					System.out.printf("Ingrese la razon de la progresion %s: ", tipoProgresion);
					double razon = teclado.nextDouble();

					System.out.printf("Ingrese el numero de terminos de la progresion %s: ", tipoProgresion);
					int numeroTerminos = teclado.nextInt();

					for (int i = 0; i < numeroTerminos; i++) {
						double termino = (opcion == 1) ? valorInicial + i * razon : valorInicial * Math.pow(razon, i);

						if (i > 0) {
							cadenaProgresion += ", ";
						}
						cadenaProgresion += String.format("%.1f", termino);
					}
					System.out.printf("La progresion %s es: %s", tipoProgresion, cadenaProgresion);
					System.out.println("");
				} else if (opcion == 3) {

					System.out.println("");
					System.out.println("Saliendo del programa");
				} else {
					System.out.println("");
					System.out.println("Ingrese una opcion correcta");
				}

			} while (opcion != 3);

		}
	}
}
