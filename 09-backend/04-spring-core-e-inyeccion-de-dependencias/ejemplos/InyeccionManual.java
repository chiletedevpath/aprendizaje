interface Notificador {
    void enviar(String mensaje);
}

final class EmailNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Email: " + mensaje);
    }
}

final class CursoService {
    private final Notificador notificador;

    // El servicio recibe la dependencia en lugar de crearla internamente.
    CursoService(Notificador notificador) {
        this.notificador = notificador;
    }

    void publicar() {
        notificador.enviar("Curso publicado");
    }
}

public class InyeccionManual {
    public static void main(String[] args) {
        CursoService servicio = new CursoService(new EmailNotificador());
        servicio.publicar();
    }
}
