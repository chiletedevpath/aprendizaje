package poo.polimorfismo.notificaciones;

public class SMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando la notificación por SMS: " + mensaje);
    }
}


