public class AdapterPractica {

    interface Notificador { void enviar(String mensaje); }
    static class ServicioExterno { void publicar(String texto){System.out.println("Externo: "+texto);} }
    static class Adaptador implements Notificador {
        private final ServicioExterno externo = new ServicioExterno();
        public void enviar(String mensaje){ externo.publicar(mensaje); }
    }
    public static void main(String[] args) {
        // Adapter traduce el contrato interno a la interfaz que ofrece el servicio externo.
        new Adaptador().enviar("Curso disponible");
    }
}
