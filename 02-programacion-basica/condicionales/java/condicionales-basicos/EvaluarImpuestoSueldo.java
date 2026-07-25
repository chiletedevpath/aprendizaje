import java.util.Scanner;

public class EvaluarImpuestoSueldo {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Ingrese el sueldo: ");
			double sueldo = entrada.nextDouble();

			if (sueldo < 0) {
				System.out.println("El sueldo no puede ser negativo.");
			} else if (sueldo > 3000) {
				System.out.println("Debe abonar el impuesto.");
			} else {
				System.out.println("No debe abonar el impuesto.");
			}
		}
	}
}
