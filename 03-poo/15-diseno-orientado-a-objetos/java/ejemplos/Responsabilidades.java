public class Responsabilidades {
    static class ValidadorUsuario { boolean esValido(String correo){ return correo != null && correo.contains("@"); } }
    static class Notificador { void enviar(String correo){ System.out.println("Notificación a " + correo); } }
    static class RegistroUsuario {
        private final ValidadorUsuario validador = new ValidadorUsuario();
        private final Notificador notificador = new Notificador();
        void registrar(String correo){ if(!validador.esValido(correo)) throw new IllegalArgumentException(); notificador.enviar(correo); }
    }
    public static void main(String[] args){ new RegistroUsuario().registrar("aprendiz@example.com"); }
}
