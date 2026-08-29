package poo.abstraccion.notificaciones;

public class NotificacionMensajeria extends Notificacion {
    public NotificacionMensajeria(String remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Mensaje instantaneo enviado: " + mensaje);
    }
}


