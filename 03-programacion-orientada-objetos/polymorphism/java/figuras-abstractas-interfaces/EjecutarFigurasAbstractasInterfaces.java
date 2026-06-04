// CLASE PRINCIPAL DONDE DEMUESTRO EL FUNCIONAMIENTO DEL POLIMORFISMO
// Y EL USO DE INTERFACES JUNTO CON CLASES ABSTRACTAS
public class EjecutarFigurasAbstractasInterfaces {
	public static void main(String[] args) {

		// USO DE POLIMORFISMO DE CLASES: UNA FIGURA PUEDE SER UN CIRCULO O UN CUADRADO
		Figura figura1 = new Cuadrado(8);
		Figura figura2 = new Cuadrado(6);

		// LLAMADAS POLIMORFICAS: CADA OBJETO EJECUTA SU PROPIA VERSION calcularArea()
		System.out.println("Area del circulo: " + figura1.calcularArea());
		System.out.println("Area del cuadrado: " + figura2.calcularArea());

		// POLIMORFISMO MEDIANTE INTERFACES: LOS OBJETOS SE TRATAN POR SU COMPORTAMIENTO
		Dibujable dibujable1 = new Circulo(5);
		Dibujable dibujable2 = new Cuadrado(4);

		dibujable1.dibujar(); // SE EJECUTA EL DIBUJAR() DE CIRCULO
		dibujable2.dibujar(); // SE EJECUTA EL DIBUJAR() DE CUADRADO

		// POLIMORFISMO ADICIONAL CON ROTABLE
		Rotable rotable = new Circulo(6);
		rotable.rotar();
	}
}

