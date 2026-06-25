package poo.polimorfismo.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class DemoNotificacionesPolimorficas {
    public static void main(String[] args) {
        List<Notificacion> notificaciones = new ArrayList<>();

        notificaciones.add(new Email());
        notificaciones.add(new SMS());
        notificaciones.add(new MensajeriaInstantanea());

        // El mismo mensaje se procesa con diferentes implementaciones.
        for (Notificacion n : notificaciones) {
            n.enviar("Hola, esta es una notificacion importante");
        }
    }
}


