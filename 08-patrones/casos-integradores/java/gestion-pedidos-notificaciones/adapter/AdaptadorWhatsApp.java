package edu.pe.utp.patrones_diseno.casos_integradores.gestion_pedidos_notificaciones.adapter;

public class AdaptadorWhatsApp implements Notificador {

    private final ServicioWhatsAppExterno servicioExterno;

    public AdaptadorWhatsApp(ServicioWhatsAppExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void enviar(String mensaje) {
        servicioExterno.enviarMensajeWhatsApp(mensaje);
    }
}

