import java.util.logging.Logger;

public class LoggingSeguro {
    private static final Logger LOG = Logger.getLogger(LoggingSeguro.class.getName());

    public static void main(String[] args) {
        String usuarioId = "usr-15";
        // El log identifica el evento sin imprimir contraseña, token ni datos sensibles.
        LOG.info(() -> "Inicio de sesión procesado para usuario=" + usuarioId);
    }
}
