package patrones.comportamiento.memento.editor_texto;

import java.util.Stack;

public class Historial {

    private Stack<Memento> estados = new Stack<>();

    public void guardar(Memento memento) {
        estados.push(memento);
    }

    public Memento recuperar() {
        if (!estados.isEmpty()) {
            return estados.pop();
        }
        return null;
    }
}