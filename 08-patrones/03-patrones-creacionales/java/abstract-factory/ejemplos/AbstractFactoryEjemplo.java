public class AbstractFactoryEjemplo {

    interface Boton { void dibujar(); }
    interface Menu { void dibujar(); }
    interface FabricaUI { Boton boton(); Menu menu(); }
    static class BotonWeb implements Boton { public void dibujar() { System.out.println("Botón web"); } }
    static class MenuWeb implements Menu { public void dibujar() { System.out.println("Menú web"); } }
    static class FabricaWeb implements FabricaUI {
        public Boton boton() { return new BotonWeb(); }
        public Menu menu() { return new MenuWeb(); }
    }
    public static void main(String[] args) {
        // La fábrica produce una familia coherente de objetos relacionados.
        FabricaUI f = new FabricaWeb(); f.boton().dibujar(); f.menu().dibujar();
    }
}
