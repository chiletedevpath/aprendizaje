public class ResponsabilidadesEjemplo {

    static class PedidoService {
        double total(double subtotal) {
            // El método conserva una sola responsabilidad: calcular el total.
            return subtotal * 1.18;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PedidoService().total(100));
    }
}
