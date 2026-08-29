public class Cliente {
	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (!esDniValido(dni)) {
			throw new IllegalArgumentException("El DNI ficticio debe contener 8 dígitos.");
		}
		this.dni = dni;
	}

	private boolean esDniValido(String dni) {
		return dni != null && dni.matches("\\d{8}");
	}
}

