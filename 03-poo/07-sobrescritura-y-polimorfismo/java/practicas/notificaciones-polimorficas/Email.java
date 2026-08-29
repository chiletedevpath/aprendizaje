package poo.polimorfismo.notificaciones;

public class Email implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando la notificación por correo: " + mensaje);
    }
}


