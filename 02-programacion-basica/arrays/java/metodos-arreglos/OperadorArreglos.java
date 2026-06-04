import java.util.Arrays;

public class OperadorArreglos {

	private int[] arreglo;

	public OperadorArreglos(int[] arreglo) {
		super();
		this.arreglo = arreglo;
	}

	// ESTE METODO NO DEVUELVE NADA, SOLO RECORRE EL ARREGLO
	public void arregloInicial() {
		for (int i : arreglo) {
			System.out.println(i);
		}
	}

	// CON ESTE METODO, HAGO QUE EL METODO ESTE EN UNA SOLA LINEA
	public int[] arregloUnaLinea() {
		return arreglo;
	}

	// ARRAYS.COPYOF PARA COPIAR EL ARREGLO Y ARRAYS.SORT ORDNEAR EL ARREGLO
	public int[] arregloOrdenado() {
		int copiaArreglo[] = Arrays.copyOf(arreglo, arreglo.length);

		Arrays.sort(copiaArreglo);
		return copiaArreglo;
	}

	public void eliminarVarlor(int valor) {
		// -1 SIGNIFICA QUE EL VALOR NO HA SIDO ENCONTRADO
		int indiceValor = -1;

		// RECORRO EL ARREGLO CON FOR
		for (int i = 0; i < arreglo.length; i++) {

			if (arreglo[i] == valor) {
				indiceValor = i;
				break;
			}
		}

		// ELIMINAR EL DATO Y RELLENAR LA LONGITUD DEL ARREGLO CON 0, AHORA SI SE
		// ENCONTRO EL VALOR, SE EJECUTA
		if (indiceValor != -1) {
			for (int i = indiceValor; i < arreglo.length; i++) {
				// DESPLAZAR LOS ELEMENTOS DEL ARREGLO A LA IZQUIERDA
				if (i < arreglo.length - 1) {
					arreglo[i] = arreglo[i + 1];
				} else {
					// AL ELIMINAR LA ULTIMA POSCICION SE REEMPLAZA CON 0
					arreglo[i] = 0;
				}
			}
		} else {
			System.out.print("El valor ingresado no esta en el arreglo");
		}
	}
}