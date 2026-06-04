import java.util.Scanner;

public class RegistroClimaSemanal {

	/*
	 * ESCRIBA UN PROGRAMA EN JAVA QUE REGISTRE EL CLIMA DE UNA GRANJA DURANTE 7
	 * DÍAS CONSECUTIVOS; EL USUARIO DEBERÁ INGRESAR LA TEMPERATURA MÍNIMA Y MÁXIMA
	 * DE CADA DÍA, Y EL PROGRAMA DEBERÁ CALCULAR Y MOSTRAR EL PROMEDIO DE LAS
	 * TEMPERATURAS MÍNIMAS Y MÁXIMAS, ASÍ COMO CUÁNTOS DÍAS LA TEMPERATURA MÁXIMA
	 * SUPERÓ LOS 30 °C, PRESENTANDO EL REPORTE EN PANTALLA CON TÍTULOS CLAROS
	 * UTILIZANDO SYSTEM.OUT.PRINTF.
	 */

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {

			double sumaMinima = 0;
			double sumaMaxima = 0;
			int superior = 0;

			double promedioMinima, promedioMaxima;

			System.out.println("----- REGISTRO SEMANAL DEL CLIMA -----");

			for (int i = 1; i <= 7; i++) {

				System.out.println("");
				System.out.printf("Temperatura del dia %d%n", i);

				System.out.print("Ingrese la temperatura minima: ");
				double minima = teclado.nextDouble();

				System.out.print("Ingrese la temperatura maxima: ");
				double maxima = teclado.nextDouble();

				sumaMinima += minima;
				sumaMaxima += maxima;

				if (maxima > 30) {
					superior++;
				}
			}
			promedioMinima = sumaMinima / 7;
			promedioMaxima = sumaMaxima / 7;

			System.out.println("\n----- REPORTE FINAL DEL CLIMA -----");
			System.out.printf("El promedio de las temperaturas minimas es %.2f%n", promedioMinima);
			System.out.printf("El promedio de las temperaturas maximas es %.2f%n", promedioMaxima);
			System.out.printf("La temperatura fue superior a 30 °C por %d dias", superior);
		}
	}
}
