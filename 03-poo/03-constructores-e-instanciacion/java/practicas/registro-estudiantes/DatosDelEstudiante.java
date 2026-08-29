// CLASE GENERICA QUE PERMITE MANEJAR LOS DATOS DEL ESTUDIANTE DE CUALQUIER TIPO (STRING, INTEGER, DOUBLE, ETC.)
// SU UTILIDAD ES REUTILIZAR EL CODIGO SIN IMPORTAR EL TIPO DE DATO QUE SE DESEE ALMACENAR

public class DatosDelEstudiante<T> {

	private T dato;

	public DatosDelEstudiante() {
	}

	public DatosDelEstudiante(T dato) {
		super();
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
}

