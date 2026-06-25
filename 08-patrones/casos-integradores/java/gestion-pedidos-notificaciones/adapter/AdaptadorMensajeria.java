package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter;

public class AdaptadorMensajeria implements Notificador {

    private final ServicioMensajeriaExterno servicioExterno;

    public AdaptadorMensajeria(ServicioMensajeriaExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void enviar(String mensaje) {
        servicioExterno.enviarMensaje(mensaje);
    }
}

