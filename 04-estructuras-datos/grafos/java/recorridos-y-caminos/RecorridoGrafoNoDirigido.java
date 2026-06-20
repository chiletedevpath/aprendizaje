import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class RecorridoGrafoNoDirigido {

	// Mapa de adyacencia para representar el grafo no dirigido.
	private Map<Character, List<Character>> ady = new HashMap<>();

	public RecorridoGrafoNoDirigido() {

		// Declara los vertices del grafo.
		for (char v : new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' }) {
			ady.put(v, new ArrayList<>());
		}

		// Registra las conexiones segun el grafo de practica.
		ady.get('A').addAll(Arrays.asList('B', 'G', 'D'));
		ady.get('B').addAll(Arrays.asList('A', 'C', 'H', 'G'));
		ady.get('C').addAll(Arrays.asList('B', 'H'));
		ady.get('D').addAll(Arrays.asList('A', 'E'));
		ady.get('E').addAll(Arrays.asList('D', 'F', 'G'));
		ady.get('F').addAll(Arrays.asList('E', 'G', 'I'));
		ady.get('G').addAll(Arrays.asList('A', 'B', 'E', 'F', 'H', 'I'));
		ady.get('H').addAll(Arrays.asList('B', 'C', 'G', 'I'));
		ady.get('I').addAll(Arrays.asList('F', 'G', 'H'));
	}

	// BFS: recorrido en anchura.
	public void bfs(char inicio) {
		System.out.println("BFS desde " + inicio + ":");

		Queue<Character> cola = new LinkedList<>();
		Set<Character> visitados = new HashSet<>();

		cola.add(inicio);
		visitados.add(inicio);

		while (!cola.isEmpty()) {
			char nodo = cola.poll();
			System.out.print(nodo + " ");

			for (char x : ady.get(nodo)) {
				if (!visitados.contains(x)) {
					visitados.add(x);
					cola.add(x);
				}
			}
		}
		System.out.println("\n");
	}

	// DFS: recorrido en profundidad.
	public void dfs(char inicio) {
		System.out.println("DFS desde " + inicio + ":");

		Deque<Character> pila = new ArrayDeque<>();
		Set<Character> visitados = new HashSet<>();

		pila.push(inicio);
		visitados.add(inicio);

		while (!pila.isEmpty()) {
			char nodo = pila.pop();
			System.out.print(nodo + " ");

			List<Character> vecinos = ady.get(nodo);
			for (int i = vecinos.size() - 1; i >= 0; i--) {
				char x = vecinos.get(i);
				if (!visitados.contains(x)) {
					visitados.add(x);
					pila.push(x);
				}
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		RecorridoGrafoNoDirigido g = new RecorridoGrafoNoDirigido();
		g.bfs('A');
		g.dfs('A');
	}
}
