public class FactoryMethodEjemplo {

    interface Exportador { void exportar(); }
    static class Pdf implements Exportador { public void exportar() { System.out.println("PDF"); } }
    static abstract class Creador {
        abstract Exportador crear();
        void ejecutar() { crear().exportar(); }
    }
    static class CreadorPdf extends Creador { Exportador crear() { return new Pdf(); } }
    public static void main(String[] args) {
        // Factory Method delega al creador concreto qué producto construir.
        new CreadorPdf().ejecutar();
    }
}
