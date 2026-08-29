interface Canal {
    void enviar(String mensaje);
}

final class Publicador {
    private final Canal canal;

    // La inyección por constructor hace explícita la dependencia obligatoria.
    Publicador(Canal canal) {
        this.canal = canal;
    }

    void publicar(String mensaje) {
        canal.enviar(mensaje);
    }
}

public class InyeccionPorConstructor {
    public static void main(String[] args) {
        Publicador publicador = new Publicador(System.out::println);
        publicador.publicar("Nueva capacitación disponible");
    }
}
