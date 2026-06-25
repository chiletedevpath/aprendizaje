package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones;

import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter.AdaptadorMensajeria;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter.Notificador;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter.ServicioMensajeriaExterno;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.model.Pedido;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer.ObservadorCliente;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer.ObservadorLog;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer.ObservadorMensajeria;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer.ObservadorPedido;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.service.GestorPedidos;

public class Principal {

    public static void main(String[] args) {

        // Obtiene la unica instancia del gestor de pedidos.
        GestorPedidos gestor = GestorPedidos.getInstancia();

        // Define las acciones que reaccionan al registro de pedidos.
        ObservadorPedido log = new ObservadorLog();
        ObservadorPedido cliente = new ObservadorCliente();

        // Adapta el servicio externo al contrato interno de notificacion.
        ServicioMensajeriaExterno servicioExterno = new ServicioMensajeriaExterno();
        Notificador adaptador = new AdaptadorMensajeria(servicioExterno);
        ObservadorPedido mensajeria = new ObservadorMensajeria(adaptador);

        gestor.agregarObservador(log);
        gestor.agregarObservador(cliente);
        gestor.agregarObservador(mensajeria);

        Pedido pedido1 = new Pedido(1, "Chilete DevPath", 150.00);
        Pedido pedido2 = new Pedido(2, "Comunidad DevPath", 220.50);

        gestor.registrarPedido(pedido1);
        System.out.println("--------------------------------------------------");
        gestor.registrarPedido(pedido2);
    }
}


