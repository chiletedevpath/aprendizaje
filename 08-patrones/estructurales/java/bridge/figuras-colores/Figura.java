package patrones.estructurales.bridge.figuras_colores;

public abstract class Figura {

    protected Color color;

    public Figura(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
