public class SistemaNotificacionesSolucion {

    interface Notificador { void enviar(String mensaje); }
    static class NotificadorConsola implements Notificador { public void enviar(String m){System.out.println(m);} }
    static class GestorCursos {
        private final Notificador notificador;
        GestorCursos(Notificador n){notificador=n;}
        void publicar(String curso){notificador.enviar("Publicado: "+curso);}
    }
    public static void main(String[] args) {
        // La solución comienza simple; se agregan patrones adicionales solo cuando aparezcan requisitos concretos.
        new GestorCursos(new NotificadorConsola()).publicar("Patrones");
    }
}
