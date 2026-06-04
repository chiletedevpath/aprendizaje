public class Empleado extends Persona {
	private double sueldoBruto;

	public Empleado(String dni, String nombre, double sueldoBruto) {
		super(dni, nombre);
		this.sueldoBruto = sueldoBruto;
	}

	public void calcularSalario() {
		System.out.println("El salario es: ");
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public String toString() {
		return super.toString() + ", sueldo bruto: " + sueldoBruto;
	}
}

