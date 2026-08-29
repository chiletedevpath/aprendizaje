public class BridgeEjemplo {

    interface Canal { void enviar(String texto); }
    static class Email implements Canal { public void enviar(String t){System.out.println("Email: "+t);} }
    static abstract class Alerta {
        protected final Canal canal; Alerta(Canal canal){this.canal=canal;} abstract void emitir();
    }
    static class AlertaCurso extends Alerta { AlertaCurso(Canal c){super(c);} void emitir(){canal.enviar("Curso vence pronto");} }
    public static void main(String[] args) {
        // Bridge permite variar tipo de alerta y canal de forma independiente.
        new AlertaCurso(new Email()).emitir();
    }
}
