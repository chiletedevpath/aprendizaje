package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer;

import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.model.Pedido;

public class ObservadorCliente implements ObservadorPedido {

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("[CLIENTE] Hola " + pedido.getCliente() +
                ", tu pedido fue registrado correctamente.");
    }
}

