public class EjecutarJerarquiaPersonas {

	public static void main(String[] args) {
		// Valida la jerarquia Persona -> Cliente, Empleado y Directivo.
		Cliente cliente1 = new Cliente("1998", "Adrian Pisco Soto", "945834043");
		Directivo directivo1 = new Directivo("1984", "Gonzalo Manrique Tejada", 10000.50, "Docente");

		Empleado empleado1 = new Empleado("1980", "Lucero Lozano Leon", 2500.00);
		directivo1.addSubordinado(empleado1);

		System.out.println("===== Cliente =====");
		System.out.println(cliente1);

		System.out.println("\n===== Directivo =====");
		System.out.println(directivo1);

		System.out.println("\n===== Empleado Subordinado =====");
		System.out.println(empleado1);
	}
}

