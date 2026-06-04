public class Cliente extends Persona {
	private String nroTelefono;

	public Cliente(String dni, String nombre, String nroTelefono) {
		super(dni, nombre);
		this.nroTelefono = nroTelefono;
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	@Override
	public String toString() {
		return super.toString() + ", telefono: " + nroTelefono;
	}
}

