package edu.pe.utp.principios_solid.casos_practicos.pedido_dependencias;

public class Main {

    public static void main(String[] args) {

        Database db = new MySQLDatabase();
        Notificador email = new EmailService();

        PedidoService pedidoService = new PedidoService(db, email);

        pedidoService.procesarPedido("Pedido #001");
    }
}

