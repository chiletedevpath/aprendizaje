public class EjecutarFigurasAbstractas {

	public static void main(String[] args) {
		// Cada subclase implementa su propio calculo de area.
		Cuadrado cuadrado = new Cuadrado(2, 4, 5);
		Circulo circulo = new Circulo(3, 4, 7);
		Triangulo triangulo = new Triangulo(8, 5, 4, 5);

		System.out.println("*************************************************");
		System.out.println("*************   FIGURA GEOMETRICA   *************");
		System.out.println("*************************************************\n");

		System.out.println("El cuadrado esta en las coordenadas x: " + cuadrado.getX() + " ; y: " + cuadrado.getY());
		System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
		System.out.println("\n************************************************************\n");

		System.out.println("El circulo esta en las coordenadas x: " + circulo.getX() + " ; y: " + circulo.getY());
		System.out.println("El area del circulo es " + circulo.calcularArea());
		System.out.println("\n************************************************************\n");

		System.out.println("El triangulo esta en las coordenadas x: " + triangulo.getX() + " ; y: " + triangulo.getY());
		System.out.println("El area del triangulo es: " + triangulo.calcularArea());
	}
}

