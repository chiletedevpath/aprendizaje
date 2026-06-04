public class Cuadrado implements Figura, Dibujable {
	private double lado;

	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
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

