public class Plantilla<T, A> {

	private T color;
	private T marca;
	private A motor;
	private T modelo;

	public Plantilla(T color, T marca, A motor, T modelo) {
		super();
		this.color = color;
		this.marca = marca;
		this.motor = motor;
		this.modelo = modelo;
	}

	public Plantilla() {

	}

	public T getColor() {
		return color;
	}

	public void setColor(T color) {
		this.color = color;
	}

	public T getMarca() {
		return marca;
	}

	public void setMarca(T marca) {
		this.marca = marca;
	}

	public A getMotor() {
		return motor;
	}

	public void setMotor(A motor) {
		this.motor = motor;
	}

	public T getModelo() {
		return modelo;
	}

	public void setModelo(T modelo) {
		this.modelo = modelo;
	}

	// METODO PARA IMPRIMIR LOS DATOS DEL VEHICULO
	@Override
	public String toString() {
		return "Color: " + color + "\nMarca: " + marca + "\nMotor: " + motor + "\nModelo: " + modelo;
	}
}

