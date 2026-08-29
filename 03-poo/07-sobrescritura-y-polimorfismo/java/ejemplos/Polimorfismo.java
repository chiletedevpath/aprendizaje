public class Polimorfismo {
    static abstract class Notificacion { abstract void enviar(); }
    static class Email extends Notificacion { @Override void enviar(){ System.out.println("Email enviado"); } }
    static class Sms extends Notificacion { @Override void enviar(){ System.out.println("SMS enviado"); } }
    public static void main(String[] args) {
        Notificacion[] canales = { new Email(), new Sms() };
        // La misma llamada ejecuta el comportamiento del objeto real.
        for (Notificacion canal : canales) canal.enviar();
    }
}
