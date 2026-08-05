package patrones.comportamiento.memento.editor_texto;

public class Editor {

    private String texto;
    private Historial historial = new Historial();

    public void escribir(String texto) {
        if (this.texto != null) {
            historial.guardar(new Memento(this.texto));
        }

        this.texto = texto;
    }

    public void mostrar() {
        System.out.println(texto);
    }

    public void deshacer() {
        Memento memento = historial.recuperar();

        if (memento != null) {
            this.texto = memento.getTexto();
            System.out.println("Cambio deshecho.");
            mostrar();
        } else {
            System.out.println("No hay cambios para deshacer.");
        }
    }
}