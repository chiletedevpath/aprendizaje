public class RetoNotificaciones {
    interface Notificable { void enviar(String mensaje); }
    static class Email implements Notificable { public void enviar(String mensaje){ System.out.println("Email: " + mensaje); } }
    static class Mensajeria implements Notificable { public void enviar(String mensaje){ System.out.println("Chat: " + mensaje); } }
    public static void main(String[] args) {
        Notificable[] canales = {new Email(), new Mensajeria()};
        for (Notificable canal : canales) canal.enviar("Curso disponible");
    }
}
