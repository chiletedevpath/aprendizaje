package edu.pe.utp.patrones_diseno.estructurales.adapter.servicio_email;

public class EmailAdapter implements EmailSender {

    private OldEmailService oldEmailService;

    // Constructor
    public EmailAdapter(OldEmailService oldEmailService) {

        this.oldEmailService = oldEmailService;
    }

    // Adaptación
    @Override
    public void send(String message) {

        oldEmailService.sendMail(message);
    }
}
