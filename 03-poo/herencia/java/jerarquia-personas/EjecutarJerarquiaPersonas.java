public class EjecutarJerarquiaPersonas {

	public static void main(String[] args) {
		// Valida la jerarquia Persona -> Cliente, Empleado y Directivo.
		Cliente cliente1 = new Cliente("00000001", "Cliente Ejemplo", "000000000");
		Directivo directivo1 = new Directivo("00000002", "Directivo Ejemplo", 10000.50, "Docente");

		Empleado empleado1 = new Empleado("00000003", "Empleado Ejemplo", 2500.00);
		directivo1.addSubordinado(empleado1);

		System.out.println("===== Cliente =====");
		System.out.println(cliente1);

		System.out.println("\n===== Directivo =====");
		System.out.println(directivo1);

		System.out.println("\n===== Empleado Subordinado =====");
		System.out.println(empleado1);
	}
}

