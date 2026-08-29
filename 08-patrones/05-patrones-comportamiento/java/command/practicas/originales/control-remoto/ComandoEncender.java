package patrones.comportamiento.command.control_remoto;

public class ComandoEncender implements Comando {

    private Luz luz;

    public ComandoEncender(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }
}
