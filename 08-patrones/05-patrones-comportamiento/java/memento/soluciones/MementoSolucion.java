public class MementoSolucion {

    record Estado(String texto) {}
    static class Editor { String texto=""; Estado guardar(){return new Estado(texto);} void restaurar(Estado e){texto=e.texto();} }
    public static void main(String[] args) {
        // Memento captura estado para restaurarlo sin exponer detalles internos del objeto.
        Editor e=new Editor(); e.texto="A"; Estado s=e.guardar(); e.texto="B"; e.restaurar(s); System.out.println(e.texto);
    }
}
