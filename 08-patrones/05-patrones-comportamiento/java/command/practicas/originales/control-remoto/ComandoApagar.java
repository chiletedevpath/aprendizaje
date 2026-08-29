package patrones.comportamiento.command.control_remoto;

public class ComandoApagar implements Comando {

    private Luz luz;

    public ComandoApagar(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }
}
