public final class Cuadrado implements Figura, Dibujable {
	private double lado;

	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado <= 0) {
			throw new IllegalArgumentException("El lado debe ser mayor que cero.");
		}
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un cuadrado");
	}
}

