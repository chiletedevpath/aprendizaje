public class RetoResponsabilidades {
    interface Notificador { void enviar(String destino); }
    static class Validador { boolean correoValido(String c){ return c!=null && c.contains("@"); } }
    static class ConsolaNotificador implements Notificador { public void enviar(String d){ System.out.println("Enviado a "+d); } }
    static class ServicioRegistro { private final Validador validador; private final Notificador notificador; ServicioRegistro(Validador v,Notificador n){validador=v;notificador=n;} void registrar(String correo){ if(!validador.correoValido(correo)) throw new IllegalArgumentException(); notificador.enviar(correo); } }
    public static void main(String[] args){ new ServicioRegistro(new Validador(),new ConsolaNotificador()).registrar("usuario@example.com"); }
}
