import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado {
	private String categoria;
	private List<Empleado> subordinados;

	public Directivo(String dni, String nombre, double sueldoBruto, String categoria) {
		super(dni, nombre, sueldoBruto);
		this.categoria = validarCategoria(categoria);
		this.subordinados = new ArrayList<>();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = validarCategoria(categoria);
	}

	private static String validarCategoria(String categoria) {
		if (categoria == null || categoria.isBlank()) {
			throw new IllegalArgumentException("La categoría es obligatoria.");
		}
		return categoria.trim();
	}

	public void addSubordinado(Empleado empleado) {
		if (empleado == null) {
			throw new IllegalArgumentException("El empleado subordinado es obligatorio.");
		}
		subordinados.add(empleado);
	}

	public List<Empleado> getSubordinados() {
		return List.copyOf(subordinados);
	}

	@Override
	public String toString() {
		return super.toString() + ", categoria: " + categoria + ", subordinados: " + subordinados.size();
	}
}

