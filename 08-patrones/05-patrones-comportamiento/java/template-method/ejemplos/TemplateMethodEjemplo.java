public class TemplateMethodEjemplo {

    static abstract class Importador {
        final void ejecutar(){leer();validar();guardar();}
        abstract void leer(); void validar(){System.out.println("Validación común");} abstract void guardar();
    }
    static class Csv extends Importador { void leer(){System.out.println("CSV");} void guardar(){System.out.println("Guardar CSV");} }
    public static void main(String[] args) {
        // Template Method fija el orden general y deja pasos específicos a la subclase.
        new Csv().ejecutar();
    }
}
