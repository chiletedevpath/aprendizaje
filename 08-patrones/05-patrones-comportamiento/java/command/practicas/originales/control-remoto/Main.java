package patrones.comportamiento.command.control_remoto;

public class Main {

    public static void main(String[] args) {

        Luz luz = new Luz();

        Comando encender = new ComandoEncender(luz);
        Comando apagar = new ComandoApagar(luz);

        ControlRemoto control = new ControlRemoto();

        control.setComando(encender);
        control.presionarBoton();

        control.setComando(apagar);
        control.presionarBoton();
    }
}