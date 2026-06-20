package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.service;

import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.model.Pedido;
import edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.observer.ObservadorPedido;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {

    // Instancia unica del gestor.
    private static GestorPedidos instancia;

    private final List<Pedido> pedidos;
    private final List<ObservadorPedido> observadores;

    private GestorPedidos() {
        pedidos = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    // Controla el acceso al unico gestor disponible.
    public static GestorPedidos getInstancia() {
        if (instancia == null) {
            instancia = new GestorPedidos();
        }
        return instancia;
    }

    public void agregarObservador(ObservadorPedido observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorPedido observador) {
        observadores.remove(observador);
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido registrado: " + pedido);

        notificarObservadores(pedido);
    }

    // Ejecuta todas las acciones asociadas al nuevo pedido.
    private void notificarObservadores(Pedido pedido) {
        for (ObservadorPedido observador : observadores) {
            observador.actualizar(pedido);
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

