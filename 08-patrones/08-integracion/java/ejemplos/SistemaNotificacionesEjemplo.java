public class SistemaNotificacionesEjemplo {

    interface Canal { void enviar(String mensaje); }
    static class Email implements Canal { public void enviar(String m){System.out.println("Email: "+m);} }
    interface Observador { void cambio(String estado); }
    static class Curso {
        java.util.List<Observador> observadores=new java.util.ArrayList<>();
        void suscribir(Observador o){observadores.add(o);} void publicar(){observadores.forEach(o->o.cambio("PUBLICADO"));}
    }
    static class Servicio {
        private final Canal canal; Servicio(Canal canal){this.canal=canal;}
        void notificar(String estado){canal.enviar("Curso: "+estado);}
    }
    public static void main(String[] args) {
        // Observer distribuye el cambio; la abstracción Canal mantiene sustituible el medio de envío.
        Servicio servicio=new Servicio(new Email()); Curso curso=new Curso(); curso.suscribir(servicio::notificar); curso.publicar();
    }
}
