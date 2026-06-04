public class AnalizarPromedioVentas {

	public static void main(String[] args) {
		double[] ventas = { 1200.50, 980.75, 1500.00, 800.20, 1750.40, 600.00 };
		double suma = 0;
		double promedio = 0;
		int mayoresPromedio = 0;
		int menoresPromedio = 0;

		// Valida datos y acumula el total de ventas en un solo recorrido.
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i] < 0) {
				System.out.println("Hay una venta negativa en la posicion " + i);
				return;
			}
			suma += ventas[i];
		}

		// Calcula el promedio para comparar cada venta contra la referencia general.
		promedio = suma / ventas.length;
		System.out.println("El total de ventas es: " + suma);
		System.out.printf("El promedio de las ventas es: %.2f%n", promedio);

		// Clasifica ventas sobre y bajo el promedio.
		System.out.print("Las ventas mayores fueron: [");
		boolean primero = true;
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i] > promedio) {
				if (!primero) {
					System.out.print(", ");
				}
				System.out.print(ventas[i]);
				mayoresPromedio++;
				primero = false;
			} else {
				menoresPromedio++;
			}
		}
		System.out.println("]");
		System.out.println("La cantidad de ventas que estuvieron por encima del promedio fueron: " + mayoresPromedio);
		System.out.println("La cantidad de ventas que estuvieron por debajo del promedio fueron: " + menoresPromedio);
	}
}
