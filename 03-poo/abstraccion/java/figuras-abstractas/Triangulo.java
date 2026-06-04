public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo() {
	}

	public Triangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
}

