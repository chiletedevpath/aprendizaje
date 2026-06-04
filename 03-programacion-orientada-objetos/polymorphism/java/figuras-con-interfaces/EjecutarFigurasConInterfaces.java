public class EjecutarFigurasConInterfaces {

	public static void main(String[] args) {
		// Polimorfismo usando la interfaz Figura como tipo comun.
		Figura figuraOne = new Circulo(6.2);
		Figura figuraTwo = new Cuadrado(8);

		System.out.println("Area del circulo: " + figuraOne.calcularArea());
		System.out.println("Area del cuadrado: " + figuraTwo.calcularArea());

		// Un mismo objeto puede exponerse por diferentes contratos.
		Dibujable dibujableOne = new Circulo(3.0);
		dibujableOne.dibujar();

		Rotable rotableOne = new Circulo(5.0);
		rotableOne.rotar();
	}
}

