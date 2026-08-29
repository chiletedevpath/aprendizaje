public class ComposicionPractica {

    interface Motor { void encender(); }
    static class MotorElectrico implements Motor { public void encender() { System.out.println("Motor eléctrico"); } }
    static class Vehiculo {
        private final Motor motor;
        Vehiculo(Motor motor) { this.motor = motor; }
        void iniciar() { motor.encender(); }
    }
    public static void main(String[] args) {
        // Vehiculo reutiliza comportamiento mediante composición, no mediante una jerarquía artificial.
        new Vehiculo(new MotorElectrico()).iniciar();
    }
}
