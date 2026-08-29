public class CommandSolucion {

    interface Comando { void ejecutar(); }
    static class Luz { void encender(){System.out.println("Luz encendida");} }
    static class Encender implements Comando { private final Luz luz; Encender(Luz l){luz=l;} public void ejecutar(){luz.encender();} }
    public static void main(String[] args) {
        // Command encapsula la acción y permite tratarla como un objeto.
        Comando c=new Encender(new Luz()); c.ejecutar();
    }
}
