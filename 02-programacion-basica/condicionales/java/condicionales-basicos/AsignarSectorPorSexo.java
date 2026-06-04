import java.util.Scanner;

public class AsignarSectorPorSexo {

	public static void main(String[] args) {

		String sexo, sector;
		final double sueldoSalud = 15000;
		final double sueldoEducacion = 12000;
		final double sueldoTransporte = 18000;
		double sueldoTotal = 0;

		try (Scanner keyboard = new Scanner(System.in)) {

			System.out.print("Ingrese su sexo (F o M) : ");
			sexo = keyboard.next();

			if (sexo.equalsIgnoreCase("f") || (sexo.equalsIgnoreCase("m"))) {
				System.out.print("Ingrese su sector (salud, educacion o transporte): ");
				sector = keyboard.next();

				if (sector.equalsIgnoreCase("salud") && (sexo.equalsIgnoreCase("f"))) {
					sueldoTotal = sueldoSalud + (sueldoSalud * 0.25);
				} else if (sector.equalsIgnoreCase("salud") && (sexo.equalsIgnoreCase("m"))) {
					sueldoTotal = sueldoSalud + (sueldoSalud * 0.20);
				} else if (sector.equalsIgnoreCase("educacion") && (sexo.equalsIgnoreCase("f"))) {
					sueldoTotal = sueldoEducacion + (sueldoEducacion * 0.12);
				} else if (sector.equalsIgnoreCase("educacion") && (sexo.equalsIgnoreCase("m"))) {
					sueldoTotal = sueldoEducacion + (sueldoEducacion * 0.11);
				} else if (sector.equalsIgnoreCase("transporte") && (sexo.equalsIgnoreCase("f"))) {
					sueldoTotal = sueldoTransporte + (sueldoTransporte * 0.20);
				} else if (sector.equalsIgnoreCase("transporte") && (sexo.equalsIgnoreCase("m"))) {
					sueldoTotal = sueldoTransporte + (sueldoTransporte * 0.15);
				} else {
					System.out.println("Ingrese correctamente el sector");
					return;
				}
				System.out.printf("Su sueldo total es: %.2f%n", sueldoTotal);
			} else {
				System.out.printf("Ingrese correctamente el sexo");
			}
		}
	}
}
