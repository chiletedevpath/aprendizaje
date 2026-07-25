class ArchivoSimple {
	private final int clave;
	private final int ubicacion;
	private final String nombre;

	public ArchivoSimple(int clave, int ubicacion, String nombre) {
		if (clave < 0 || ubicacion < 0 || nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("Los datos del registro deben ser válidos.");
		}
		this.clave = clave;
		this.ubicacion = ubicacion;
		this.nombre = nombre.trim();
	}

	public int getClave() {
		return clave;
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return String.format("%3d | %4d | %-15s", clave, ubicacion, nombre);
	}
}
