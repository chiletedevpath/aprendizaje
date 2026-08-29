public class ResponsabilidadesSolucion {

    interface Notificador { void enviar(String mensaje); }

    static class EmailNotificador implements Notificador {
        public void enviar(String mensaje) { System.out.println("Email: " + mensaje); }
    }

    static class PedidoService {
        private final Notificador notificador;
        PedidoService(Notificador notificador) {
            // La dependencia llega desde fuera y evita acoplar el servicio a Email.
            this.notificador = notificador;
        }
        void confirmar() { notificador.enviar("Pedido confirmado"); }
    }

    public static void main(String[] args) {
        new PedidoService(new EmailNotificador()).confirmar();
    }
}
