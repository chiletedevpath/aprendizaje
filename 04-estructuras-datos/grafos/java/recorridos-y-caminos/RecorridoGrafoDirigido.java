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

	// Mapa de adyacencia: cada vertice mantiene sus destinos.
	private Map<Character, List<Character>> ady = new HashMap<>();

	public RecorridoGrafoDirigido() {

		// Declara vertices vacios antes de registrar sus aristas.
		for (char v : new char[] { 'A', 'B', 'C', 'D', 'F', 'G' }) {
			ady.put(v, new ArrayList<>());
		}

		// Registra las conexiones segun el grafo de practica.
		ady.get('A').add('C');
		ady.get('A').add('B');
		ady.get('A').add('D');
		ady.get('B').add('F');
		ady.get('B').add('D');
		ady.get('C').add('G');
		ady.get('D').add('F');
		ady.get('G').add('F');
	}

	// BFS: recorrido en anchura.
	public void bfs(char origen) {

		// Evita visitar el mismo vertice dos veces.
		Set<Character> visitados = new HashSet<>();

		// Cola: primero en entrar, primero en salir.
		Queue<Character> cola = new LinkedList<>();

		// Marca el origen como visitado y lo coloca en la cola.
		visitados.add(origen);
		cola.add(origen);

		System.out.println("BFS desde " + origen + ":");

		while (!cola.isEmpty()) {
			char actual = cola.poll();
			System.out.print(actual + " ");

			for (char vecino : ady.get(actual)) {
				if (!visitados.contains(vecino)) {
					visitados.add(vecino);
					cola.add(vecino);
				}
			}
		}

		System.out.println("\n");
	}

	// DFS: recorrido en profundidad.
	public void dfs(char origen) {

		Set<Character> visitados = new HashSet<>();

		// Pila: ultimo en entrar, primero en salir.
		Deque<Character> pila = new ArrayDeque<>();

		visitados.add(origen);
		pila.push(origen);

		System.out.println("DFS desde " + origen + ":");

		while (!pila.isEmpty()) {
			char actual = pila.pop();
			System.out.print(actual + " ");

			// Recorre vecinos en orden inverso para controlar la salida.
			List<Character> vecinos = ady.get(actual);

			for (int i = vecinos.size() - 1; i >= 0; i--) {
				char vecino = vecinos.get(i);

				if (!visitados.contains(vecino)) {
					visitados.add(vecino);
					pila.push(vecino);
				}
			}
		}

		System.out.println("\n");
	}

	// Programa principal de prueba.
	public static void main(String[] args) {
		RecorridoGrafoDirigido g = new RecorridoGrafoDirigido();
		g.bfs('A');
		g.dfs('A');
	}
}
