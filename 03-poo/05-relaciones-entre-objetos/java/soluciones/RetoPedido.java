import java.util.ArrayList;
import java.util.List;

public class RetoPedido {
    static class Cliente { final String nombre; Cliente(String nombre) { this.nombre = nombre; } }
    static class DetallePedido { final String producto; final int cantidad; DetallePedido(String p, int c){ producto=p; cantidad=c; } }
    static class Pedido {
        // El pedido se asocia con un cliente y compone sus detalles.
        final Cliente cliente;
        final List<DetallePedido> detalles = new ArrayList<>();
        Pedido(Cliente cliente) { this.cliente = cliente; }
        void agregar(String producto, int cantidad) { detalles.add(new DetallePedido(producto, cantidad)); }
    }
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new Cliente("Cliente Chilete"));
        pedido.agregar("Cuaderno", 2);
        System.out.println(pedido.detalles.size());
    }
}
