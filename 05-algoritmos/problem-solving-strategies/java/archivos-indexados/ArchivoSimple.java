class ArchivoSimple {
	private int clave;
	private int ubicacion;
	private String nombre;

	public ArchivoSimple(int clave, int ubicacion, String nombre) {
		this.clave = clave;
		this.ubicacion = ubicacion;
		this.nombre = nombre;
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
