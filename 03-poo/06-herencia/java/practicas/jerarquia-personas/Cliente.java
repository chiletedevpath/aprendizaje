public class Cliente extends Persona {
	private String nroTelefono;

	public Cliente(String dni, String nombre, String nroTelefono) {
		super(dni, nombre);
		this.nroTelefono = validarTelefono(nroTelefono);
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = validarTelefono(nroTelefono);
	}

	private static String validarTelefono(String nroTelefono) {
		if (nroTelefono == null || !nroTelefono.matches("\\d{9}")) {
			throw new IllegalArgumentException("El teléfono ficticio debe contener 9 dígitos.");
		}
		return nroTelefono;
	}

	@Override
	public String toString() {
		return super.toString() + ", telefono: " + nroTelefono;
	}
}

