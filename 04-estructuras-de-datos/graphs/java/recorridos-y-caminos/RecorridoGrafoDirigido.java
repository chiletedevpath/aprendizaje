import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class RecorridoGrafoDirigido {

	// CREO UN MAPA PARA GUARDAR MI LISTA DE ADYACENCIA
	// CADA LETRA VA A TENER UNA LISTA DE LOS NODOS A LOS QUE APUNTA
	private Map<Character, List<Character>> ady = new HashMap<>();

	public RecorridoGrafoDirigido() {

		// AGREGO TODOS LOS VERTICES DEL GRAFO
		// (LOS DECLARO VACIOS PARA LUEGO PONER SUS ARISTAS)
		for (char v : new char[] { 'A', 'B', 'C', 'D', 'F', 'G' }) {
			ady.put(v, new ArrayList<>());
		}

		// ==========================
		// REGISTRO LAS MIS CONEXIONES SEGÚN EL GRAFO
		// ==========================

		// A -> C, B, D (NO TOMO A->A PORQUE NO APORTA AL RECORRIDO)
		ady.get('A').add('C');
		ady.get('A').add('B');
		ady.get('A').add('D');

		// B -> F, D
		ady.get('B').add('F');
		ady.get('B').add('D');

		// C -> G
		ady.get('C').add('G');

		// D -> F
		ady.get('D').add('F');

		// G -> F
		ady.get('G').add('F');

		// F NO APUNTA A NADIE
	}

	// ==========================
	// BFS - RECORRIDO EN ANCHURA
	// ==========================
	public void bfs(char origen) {

		// CONJUNTO PARA EVITAR VISITAR DOS VECES
		Set<Character> visitados = new HashSet<>();

		// COLA -> PRIMERO EN ENTRAR, PRIMERO EN SALIR
		Queue<Character> cola = new LinkedList<>();

		// MARCO EL ORIGEN COMO VISITADO Y LO COLO EN LA COLA
		visitados.add(origen);
		cola.add(origen);

		System.out.println("BFS DESDE " + origen + ":");

		// MIENTRAS EXISTA ALGO EN LA COLA SIGO RECORRIENDO
		while (!cola.isEmpty()) {

			// SACO EL PRIMER ELEMENTO DE LA COLA
			char actual = cola.poll();
			System.out.print(actual + " ");

			// AGREGO SUS VECINOS UNO POR UNO
			for (char vecino : ady.get(actual)) {

				// SOLO AGREGO SI NO FUE VISITADO
				if (!visitados.contains(vecino)) {
					visitados.add(vecino); // MARCO COMO VISITADO
					cola.add(vecino); // Y LO METO A LA COLA
				}
			}
		}

		System.out.println("\n");
	}

	// ==========================
	// DFS - RECORRIDO EN PROFUNDIDAD
	// ==========================
	public void dfs(char origen) {

		// MARCO VISITADOS IGUAL QUE EN BFS
		Set<Character> visitados = new HashSet<>();

		// PILA -> ULTIMO EN ENTRAR, PRIMERO EN SALIR
		Deque<Character> pila = new ArrayDeque<>();

		// AGREGO EL ORIGEN A LA PILA
		visitados.add(origen);
		pila.push(origen);

		System.out.println("DFS DESDE " + origen + ":");

		while (!pila.isEmpty()) {

			// SACO EL TOPE DE LA PILA
			char actual = pila.pop();
			System.out.print(actual + " ");

			// PARA QUE SE VEA COMO EL GRAFO, AGREGO LOS VECINOS EN ORDEN INVERSO
			// ASI SUBE PRIMERO EL QUE VISUALMENTE ESTA ADELANTE
			List<Character> vecinos = ady.get(actual);

			for (int i = vecinos.size() - 1; i >= 0; i--) {
				char vecino = vecinos.get(i);

				// SOLO AGREGO SI NO FUE VISITADO
				if (!visitados.contains(vecino)) {
					visitados.add(vecino);
					pila.push(vecino); // LO PONGO EN LA PILA
				}
			}
		}

		System.out.println("\n");
	}

	// MAIN PARA PROBAR EL CÓDIGO
	public static void main(String[] args) {

		// CREO EL GRAFO
		RecorridoGrafoDirigido g = new RecorridoGrafoDirigido();

		// EJECUTO BFS Y DFS DESDE A
		g.bfs('A');
		g.dfs('A');
	}
}