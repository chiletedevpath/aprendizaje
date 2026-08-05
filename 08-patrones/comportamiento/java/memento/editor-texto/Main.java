package patrones.comportamiento.memento.editor_texto;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.escribir("Hola");
        editor.mostrar();

        editor.escribir("Chilete DevPath");
        editor.mostrar();

        editor.deshacer();
    }
}