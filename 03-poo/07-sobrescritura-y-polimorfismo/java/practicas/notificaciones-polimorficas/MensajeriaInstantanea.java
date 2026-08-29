package poo.polimorfismo.notificaciones;

public class MensajeriaInstantanea implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificacion por mensajeria instantanea: " + mensaje);
    }
}


