import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListaInversaSimple {
	private List<ArchivoSimple> asc; // archivo de claves (orden ascendente)

	public ListaInversaSimple() {
		asc = new ArrayList<>();
	}

	// Carga de la tabla inicial
	public void cargarDatosIniciales() {
		asc.clear();
		asc.add(new ArchivoSimple(8, 600, "Eva Mendez"));
		asc.add(new ArchivoSimple(17, 480, "Olga Castro"));
		asc.add(new ArchivoSimple(23, 120, "Yolanda Morales"));
		asc.add(new ArchivoSimple(45, 240, "Norma Gomez"));
		asc.add(new ArchivoSimple(87, 360, "Jael Alcantara"));
		asc.add(new ArchivoSimple(94, 0, "Ana Torres"));
		// asc ya está en orden ascendente por claves
	}

	// Devuelve la vista descendente construida a partir de asc.
	private List<ArchivoSimple> construirDescendente() {
		List<ArchivoSimple> desc = new ArrayList<>(asc);
		Collections.reverse(desc);
		return desc;
	}

	public void mostrarTablaFormatted() {
		List<ArchivoSimple> desc = construirDescendente();

		System.out.println();
		System.out.println("\tArchivo de Claves\t\t\tArchivo Principal");
		System.out.println("Indice\tClave\tUbicación\tPuntero\t\tClave\tNombre");
		System.out.println("----------------------------------------------------------------------");

		int filas = 8; 
		for (int i = 0; i < filas; i++) {
			// Izquierda: asc (archivo de claves)
			String claveIzq = "Null";
			String ubicIzq = "Null";

			if (i < asc.size()) {
				ArchivoSimple a = asc.get(i);
				claveIzq = String.valueOf(a.getClave());
				ubicIzq = String.valueOf(a.getUbicacion());
			}

			// Derecha: desc (archivo principal)
			String claveDer = "Null";
			String nombreDer = "Null";
			if (i < desc.size()) {
				ArchivoSimple b = desc.get(i);
				claveDer = String.valueOf(b.getClave());
				nombreDer = b.getNombre();
			}

			// Puntero: calculo la posición en 'desc' donde aparece la clave asc[i]
			String puntero = "Null";
			if (i < asc.size()) {
				int clave = asc.get(i).getClave();
				int posEnDesc = -1;
				for (int j = 0; j < desc.size(); j++) {
					if (desc.get(j).getClave() == clave) {
						posEnDesc = j;
						break;
					}
				}
				puntero = (posEnDesc == -1) ? "Null" : String.valueOf(posEnDesc);
			}

			System.out.printf("%d\t%s\t%s\t\t%s\t\t%s\t%s%n", i, claveIzq, ubicIzq, puntero, claveDer, nombreDer);
		}

		System.out.println("\tAscendente\t\t\t\tDescendente\n");
	}

	public void agregar(int clave, int ubicacion, String nombre) {
		// buscar posición de inserción
		int pos = 0;
		while (pos < asc.size() && asc.get(pos).getClave() < clave)
			pos++;

		// si ya existe clave, no insertar
		if (pos < asc.size() && asc.get(pos).getClave() == clave) {
			System.out.printf("La clave %d ya existe (no se agrega).%n", clave);
			return;
		}

		asc.add(pos, new ArchivoSimple(clave, ubicacion, nombre));
		System.out.printf("Agregado: clave=%d, ubic=%d, nombre=%s (pos asc %d)%n", clave, ubicacion, nombre, pos);
	}

	public void eliminar(int clave, String nombre) {
		int pos = -1;
		for (int i = 0; i < asc.size(); i++) {
			ArchivoSimple a = asc.get(i);
			if (a.getClave() == clave && a.getNombre().equalsIgnoreCase(nombre)) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.printf("No se encontró (clave=%d, nombre=%s).%n", clave, nombre);
			return;
		}

		ArchivoSimple eliminado = asc.remove(pos);
		System.out.printf("Eliminado: clave=%d, nombre=%s (pos asc %d)%n", eliminado.getClave(),
				eliminado.getNombre(), pos);
	}
}