import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado {
	private String categoria;
	private List<Empleado> subordinados;

	public Directivo(String dni, String nombre, double sueldoBruto, String categoria) {
		super(dni, nombre, sueldoBruto);
		this.categoria = categoria;
		this.subordinados = new ArrayList<>();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void addSubordinado(Empleado empleado) {
		// Registra empleados bajo la responsabilidad del directivo.
		subordinados.add(empleado);
	}

	public List<Empleado> getSubordinados() {
		return subordinados;
	}

	@Override
	public String toString() {
		return super.toString() + ", categoria: " + categoria + ", subordinados: " + subordinados.size();
	}
}

