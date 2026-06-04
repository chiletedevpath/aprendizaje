// CLASE GENERICA PARA MANEJAR LOS DATOS DEL ESTUDIANTE: TRABAJA CON DOS TIPOS DE DATOS DIFERENTES (T Y A)
// SE UTILIZA T PARA DATOS DE TEXTO (NOMBRE Y APELLIDO) Y A PARA DATOS NUMERICOS (NOTAS)

public class Estudiante<T, A> {

	private DatosDelEstudiante<T> nombre;
	private DatosDelEstudiante<T> apellido;
	private DatosDelEstudiante<A> notaOne;
	private DatosDelEstudiante<A> notaTwo;

	public Estudiante(DatosDelEstudiante<T> nombre, DatosDelEstudiante<T> apellido, DatosDelEstudiante<A> notaOne,
			DatosDelEstudiante<A> notaTwo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaOne = notaOne;
		this.notaTwo = notaTwo;
	}

	public DatosDelEstudiante<T> getNombre() {
		return nombre;
	}

	public void setNombre(DatosDelEstudiante<T> nombre) {
		this.nombre = nombre;
	}

	public DatosDelEstudiante<T> getApellido() {
		return apellido;
	}

	public void setApellido(DatosDelEstudiante<T> apellido) {
		this.apellido = apellido;
	}

	public DatosDelEstudiante<A> getNotaOne() {
		return notaOne;
	}

	public void setNotaOne(DatosDelEstudiante<A> notaOne) {
		this.notaOne = notaOne;
	}

	public DatosDelEstudiante<A> getNotaTwo() {
		return notaTwo;
	}

	public void setNotaTwo(DatosDelEstudiante<A> notaTwo) {
		this.notaTwo = notaTwo;
	}

	// METODO GENERICO PARA CALCULAR EL PROMEDIO DE LAS NOTAS
	// SE RESTRINGE EL TIPO A U EXTENDIENDO DE NUMBER PARA PODER CONVERTIR A double
	public <U extends Number> double promedio() {
		double nota1 = ((Number) notaOne.getDato()).doubleValue();
		double nota2 = ((Number) notaTwo.getDato()).doubleValue();
		return (nota1 + nota2) / 2;
	}
}

