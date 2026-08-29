public class Empleado extends Persona {
	private double sueldoBruto;

	public Empleado(String dni, String nombre, double sueldoBruto) {
		super(dni, nombre);
		this.sueldoBruto = validarSueldo(sueldoBruto);
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = validarSueldo(sueldoBruto);
	}

	private static double validarSueldo(double sueldoBruto) {
		if (sueldoBruto < 0) {
			throw new IllegalArgumentException("El sueldo no puede ser negativo.");
		}
		return sueldoBruto;
	}

	@Override
	public String toString() {
		return super.toString() + ", sueldo bruto: " + sueldoBruto;
	}
}

