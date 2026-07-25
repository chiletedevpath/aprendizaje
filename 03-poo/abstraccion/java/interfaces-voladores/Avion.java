package poo.abstraccion.voladores;

public class Avion implements Volador {

    @Override
    public void volar() {
        System.out.println("El avión vuela mediante sus motores.");
    }
}
