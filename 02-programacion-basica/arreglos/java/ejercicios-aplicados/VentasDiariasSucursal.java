import java.util.Scanner;

public class VentasDiariasSucursal {
	/*
	 * ESCRIBIR UN PROGRAMA QUE REGISTRE LAS VENTAS DIARIAS DE 3 SUCURSALES DURANTE
	 * 5 DÍAS, INGRESANDO POR CADA SUCURSAL Y DÍA EL TOTAL VENDIDO EN SOLES; EL
	 * SISTEMA DEBE MOSTRAR EL TOTAL SEMANAL POR SUCURSAL E INDICAR CUÁL SUCURSAL
	 * VENDIÓ MÁS, UTILIZANDO ESTRUCTURAS FOR ANIDADAS PARA PROCESAR LA INFORMACIÓN.
	 */

	public static void main(String[] args) {

		System.out.println("==============================================");
		System.out.println("======= VENTAS DIARIAS DE TIENDA CARITO ======");

		Scanner teclado = new Scanner(System.in);

		int sucursales = 3;
		int dias = 5;
		double[][] ventaDiaria = new double[sucursales][dias]; // APLICAMOS TEORIA DE MATRIZ

		for (int i = 0; i < sucursales; i++) {
			System.out.println("\nSucursal " + (i + 1));
			for (int j = 0; j < dias; j++) {
				System.out.printf("Ingrese la venta del dia %d: ", (j + 1));
				ventaDiaria[i][j] = teclado.nextDouble();
			}
		}
		teclado.close(); // LO CIERRO PORQUE YA NO VOY A INGRESAR MAS DATOS

		System.out.println("==============================================");
		System.out.println("VENTAS TOTAL POR SUCURSAL");

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
		System.out.printf("La sucursal %d vendio mas con %.2f nuevos soles", (sucursalMayor+1), ventaMayor);
	}
}