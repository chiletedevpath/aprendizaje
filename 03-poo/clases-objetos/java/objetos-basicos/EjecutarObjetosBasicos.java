public class EjecutarObjetosBasicos {

	public static void main(String[] args) {

		// CLASE ANIMAL

		Animal animal = new Animal("sin-imagen", "Animal Ejemplo", 20, "Mamifero", 13.52, "Marron",
				true);

		String reporteHtmlAnimal = """
				                <tr>
				                    <td>
				                        <figure class="image is-64x64">
				                            <span>%s</span>
				                        </figure>
				                    </td>
				                    </td>
				<td valign="center">%s</td>
				                <td>%d</td> <!-- Edad -->
				                <td>%s</td> <!-- Especie -->
				                <td>%.2f</td>
				                <td>%s</td>
				                <td>%s</td>
				    </tr>
				                """;

		System.out.printf(reporteHtmlAnimal, animal.getFoto(), animal.getNombre(), animal.getEdad(),
				animal.getEspecie(), animal.getPeso(), animal.getColor(), animal.raza());

		System.out.printf("%n#####################################%n%n");

		// CLASE CASA

		Casa casa = new Casa("sin-imagen", true, "Direccion de ejemplo", 3, 2, false, 10.5);

		String reporteHtmlCasa = """
				            <tr>
				                <td>
				                    <figure class="image is-64x64">
				                        <span>%s</span>
				                    </figure>
				                </td>
				                </td>
				<td>%s</td>
				<td>%s</td>
				<td>%d</td>
				<td>%d</td>
				<td>%s</td>
				<td>%.2f</td>
				</tr>
				            """;
		System.out.printf(reporteHtmlCasa, casa.getFoto(), casa.materialNoble(), casa.getDirreccion(),
				casa.getCantHabitacion(), casa.getCantPiso(), casa.disponible(), casa.getTamano());

		System.out.printf("%n#####################################%n%n");

		// CLASE CELULAR

		Celular celular = new Celular("sin-imagen", "IMEI-EJEMPLO", "Black", "Modelo Ejemplo",
				"Motorola", 8, 50);

		String reporteHtmlCelular = """
				            <tr>
				                <td>
				                    <figure class="image is-64x64">
				                        <span>%s</span>
				                    </figure>
				                </td>
				                </td>
				<td>%s</td>
				<td>%s</td>
				<td>%s</td>
				<td>%s</td>
				<td>%d</td>
				<td>%d</td>
				</tr>
				            """;

		System.out.printf(reporteHtmlCelular, celular.getFoto(), celular.getImei(), celular.getColor(),
				celular.getModelo(), celular.getMarca(), celular.getRam(), celular.getCamara());

		System.out.printf("%n#####################################%n%n");
		
		// CLASE ESTUDIANTE

		Estudiante estudiante = new Estudiante();
		estudiante.setFoto("sin-imagen");
		estudiante.setId(242005);
		estudiante.setNombre("Estudiante Ejemplo");
		estudiante.setApellido("Apellido Ejemplo");
		estudiante.setGrado(5);
		estudiante.setGenero("Masculino");
		estudiante.setPromedio(17.8);

		String reporteHtmlEstudiante = """
				            <tr>
				                <td>
				                    <figure class="image is-64x64">
				                        <span>%s</span>
				                    </figure>
				                </td>
				                </td>
				<td>%d</td>
				<td>%s</td>
				<td>%s</td>
				<td>%d</td>
				<td>%s</td>
				<td>%.2f</td>
				</tr>
				            """;

		System.out.printf(reporteHtmlEstudiante, estudiante.getFoto(), estudiante.getId(), estudiante.getNombre(),
				estudiante.getApellido(), estudiante.getGrado(), estudiante.getGenero(), estudiante.getPromedio());

		System.out.printf("%n#####################################%n%n");

	}
}
