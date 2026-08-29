public class CondicionalAStrategyEjemplo {

    interface Canal { void enviar(String m); }
    static class Email implements Canal { public void enviar(String m){System.out.println("Email "+m);} }
    static class Servicio { private final Canal canal; Servicio(Canal canal){this.canal=canal;} void enviar(){canal.enviar("alerta");} }
    public static void main(String[] args) {
        // La abstracción elimina un condicional creciente cuando cada canal tiene comportamiento propio.
        new Servicio(new Email()).enviar();
    }
}
