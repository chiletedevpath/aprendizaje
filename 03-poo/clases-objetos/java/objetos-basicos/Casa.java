public class Casa {
	private String foto;
	public boolean esMaterialNoble;
	public String dirreccion;
	public int cantHabitacion;
	public int cantPiso;
	public boolean estaDisponible;
	public double tamano;

	public Casa() {

	}

	public Casa(String foto, boolean esMaterialNoble, String dirreccion, int cantHabitacion, int cantPiso,
			boolean estaDisponible, double tamano) {
		super();
		this.foto = foto;
		this.esMaterialNoble = esMaterialNoble;
		this.dirreccion = dirreccion;
		this.cantHabitacion = cantHabitacion;
		this.cantPiso = cantPiso;
		this.estaDisponible = estaDisponible;
		this.tamano = tamano;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean getEsMaterialNoble() {
		return esMaterialNoble;
	}

	public void setEsMaterialNoble(boolean esMaterialNoble) {
		this.esMaterialNoble = esMaterialNoble;
	}

	public String getDirreccion() {
		return dirreccion;
	}

	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	public int getCantHabitacion() {
		return cantHabitacion;
	}

	public void setCantHabitacion(int cantHabitacion) {
		this.cantHabitacion = cantHabitacion;
	}

	public int getCantPiso() {
		return cantPiso;
	}

	public void setCantPiso(int cantPiso) {
		this.cantPiso = cantPiso;
	}

	public boolean getEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public String materialNoble() {
		if (esMaterialNoble) {
			return "si";
		} else {
			return "no";
		}
	}

	public String disponible() {
		if (estaDisponible) {
			return "si";
		} else {
			return "no";
		}
	}
}

