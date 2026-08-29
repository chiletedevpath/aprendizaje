public class LspSolucion {

    interface Notificacion { void enviar(String mensaje); }
    static class Email implements Notificacion { public void enviar(String m) { System.out.println("Email " + m); } }
    static void avisar(Notificacion n) { n.enviar("curso actualizado"); }
    public static void main(String[] args) {
        // Cualquier implementación válida puede sustituir al contrato Notificacion.
        avisar(new Email());
    }
}
