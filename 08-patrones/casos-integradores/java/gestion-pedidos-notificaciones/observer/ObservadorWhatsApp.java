package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer;

import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter.Notificador;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.model.Pedido;

public class ObservadorWhatsApp implements ObservadorPedido{

    private final Notificador notificador;

    public ObservadorWhatsApp(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void actualizar(Pedido pedido) {
        String mensaje = "Nuevo pedido registrado para " + pedido.getCliente()
                + " por un monto de S/ " + pedido.getMonto();

        notificador.enviar(mensaje);

    }
}

