public abstract class Figura {
	protected double x;
	protected double y;

	public Figura() {
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double calcularArea();

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

