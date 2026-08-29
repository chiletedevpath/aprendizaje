import java.util.Scanner;

public class EvaluarRangoSueldo {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Ingrese el sueldo: ");
			double sueldo = entrada.nextDouble();

			if (sueldo < 0) {
				System.out.println("El sueldo no puede ser negativo.");
			} else if (sueldo >= 10000) {
				System.out.println("El sueldo se encuentra en el rango alto.");
			} else if (sueldo >= 3000) {
				System.out.println("El sueldo se encuentra en el rango medio.");
			} else {
				System.out.println("El sueldo se encuentra en el rango bajo.");
			}
		}
	}
}
