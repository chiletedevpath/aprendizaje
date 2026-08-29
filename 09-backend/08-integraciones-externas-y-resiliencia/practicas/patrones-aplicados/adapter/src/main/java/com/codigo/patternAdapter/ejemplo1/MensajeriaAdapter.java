package com.codigo.patternAdapter.ejemplo1;

public class MensajeriaAdapter implements INotificador {
    private final ServicioMensajeriaExterno servicioExterno;

    public MensajeriaAdapter(ServicioMensajeriaExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void enviar(String mensaje) {
        servicioExterno.enviarMensaje(mensaje);
    }
}
