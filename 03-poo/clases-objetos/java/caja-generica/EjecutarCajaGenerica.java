public class EjecutarCajaGenerica {

	public static void main(String[] args) {

		Box<String> elementosString = new Box<>(""); // SIEMPRE SE DEBE INICIALIZAR LA INSTANCIA

		elementosString.setContent("Contenido de ejemplo");

		String contenido = elementosString.getContent();

		System.out.println(contenido);

		// SEGUNDO EJEMPLO
		Box<Integer> edad = new Box<>(0);

		edad.setContent(27);

		int mostrarEdad = edad.getContent();

		mostrarEdad = mostrarEdad + 5;

		System.out.println("Mi edad es: " + mostrarEdad);
	}
}

