// AQUI APLICO HERENCIA SIMPLE (EXTENDS) Y HERENCIA MULTIPLE (IMPLEMENTS ROTABLE Y DIBUJABLE)
public class Circulo extends Figura implements Rotable, Dibujable {

	// ATRIBUTO
	private double radio;

	// CONSTRUCTOR PARA INICIALIZAR EL RADIO.
	public Circulo(double radio) {
		this.radio = radio;
	}

	// IMPLEMENTACION DEL METODO ABSTRACTO DEFINIDO EN FIGURA. CADA FIGURA TIENE SU
	// PROPIA FORMA DE CALCULAR EL AREA

	// POLIMORFISMO.
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	// IMPLEMENTACION DEL METODO DE LA INTERFAZ DIBUJABLE
	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}

	// IMPLEMENTACION DEL METODO DE LA INTERFAZ ROTABLE
	@Override
	public void rotar() {
		System.out.println("Rotando un circulo");
	}
}


