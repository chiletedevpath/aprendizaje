public class IspSolucion {

    interface Pagable { void pagar(); }
    interface Capacitable { void capacitar(); }
    static class Freelancer implements Pagable { public void pagar() { System.out.println("Pago"); } }
    public static void main(String[] args) {
        // El cliente depende solo de la operación que realmente necesita.
        new Freelancer().pagar();
    }
}
