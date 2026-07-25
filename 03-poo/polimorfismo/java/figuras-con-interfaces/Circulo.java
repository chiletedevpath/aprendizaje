public final class Circulo implements Figura, Rotable, Dibujable {
	private double radio;

	public Circulo() {
	}

	public Circulo(double radio) {
		setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if (radio <= 0) {
			throw new IllegalArgumentException("El radio debe ser mayor que cero.");
		}
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}

	@Override
	public void rotar() {
		System.out.println("Rotando el circulo");
	}
}

