package poo.abstraccion.voladores;

public class DemoVoladores {

    public static void main(String[] args) {
        Volador[] voladores = { new Avion(), new Tucan() };

        for (Volador volador : voladores) {
            volador.volar();
        }
    }
}
