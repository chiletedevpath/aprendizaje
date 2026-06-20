package edu.pe.utp.principios_solid.casos_practicos.pedido_dependencias;

public class EmailService implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
