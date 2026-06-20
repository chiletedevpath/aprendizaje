import java.util.Scanner;

public class VentasDiariasSucursal {
	/*
	 * ESCRIBIR UN PROGRAMA QUE REGISTRE LAS VENTAS DIARIAS DE 3 SUCURSALES DURANTE
	 * 5 DIAS, INGRESANDO POR CADA SUCURSAL Y DIA EL TOTAL VENDIDO EN SOLES.
	 */

	public static void main(String[] args) {

		System.out.println("==============================================");
		System.out.println("======= VENTAS DIARIAS DE CHILETE STORE =====");

		Scanner teclado = new Scanner(System.in);

		int sucursales = 3;
		int dias = 5;
		double[][] ventaDiaria = new double[sucursales][dias];

		for (int i = 0; i < sucursales; i++) {
			System.out.println("\nSucursal " + (i + 1));
			for (int j = 0; j < dias; j++) {
				System.out.printf("Ingrese la venta del dia %d: ", (j + 1));
				ventaDiaria[i][j] = teclado.nextDouble();
			}
		}
		teclado.close();

		System.out.println("==============================================");
		System.out.println("VENTAS TOTALES POR SUCURSAL");

		double ventaMayor = 0;
		int sucursalMayor = 0;

		for (int i = 0; i < sucursales; i++) {
			double sumaTotal = 0;
			for (int j = 0; j < dias; j++) {
				sumaTotal += ventaDiaria[i][j];
			}
			System.out.printf("Sucursal %d: %.2f nuevos soles%n", (i + 1), sumaTotal);

			if (sumaTotal > ventaMayor) {
				ventaMayor = sumaTotal;
				sucursalMayor = i;
			}
		}
		System.out.println("==============================================");
		System.out.printf("La sucursal %d vendio mas con %.2f nuevos soles", (sucursalMayor + 1), ventaMayor);
	}
}
