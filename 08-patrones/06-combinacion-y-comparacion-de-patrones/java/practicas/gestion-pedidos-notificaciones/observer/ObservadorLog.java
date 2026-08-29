package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer;

import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.model.Pedido;

public class ObservadorLog implements ObservadorPedido {

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("[LOG] Se registro un nuevo pedido con ID: " + pedido.getId());

    }
}

