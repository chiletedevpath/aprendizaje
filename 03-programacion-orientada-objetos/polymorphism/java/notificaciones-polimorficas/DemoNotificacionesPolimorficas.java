package poo.polimorfismo.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class DemoNotificacionesPolimorficas {
    public static void main(String[] args) {
        List<Notificacion> notificaciones = new ArrayList<>();

        notificaciones.add(new Email());
        notificaciones.add(new SMS());
        notificaciones.add(new WhatsApp());

        // El mismo mensaje se procesa con diferentes implementaciones.
        for (Notificacion n : notificaciones){
            n.enviar("Hola, este es una notificacion importante");
        }
    }
}


