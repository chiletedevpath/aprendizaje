package patrones.comportamiento.memento.editor_texto;

public class Memento {

    private String texto;

    public Memento(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
