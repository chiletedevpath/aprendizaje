package poo.abstraccion.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class DemoNotificacionesAbstractas {
    public static void main(String[] args) {
        List<Notificacion> notificaciones = new ArrayList<>();

        // Cada subclase implementa el envio manteniendo una interfaz comun.
        notificaciones.add(new NotificacionWSP("Sistema WSP"));
        notificaciones.add(new NotificacionEmail("Sistema EMAIL"));
        notificaciones.add(new NotificacionSMS("Sistema SMS"));

        for(Notificacion lista: notificaciones){
            lista.enviar("Mensaje 1");
        }
    }
}


