public class Composicion {
    static class Motor {
        void encender() { System.out.println("Motor encendido"); }
    }
    static class Auto {
        // El Auto contiene su Motor como parte de su estructura.
        private final Motor motor = new Motor();
        void encender() { motor.encender(); }
    }
    public static void main(String[] args) { new Auto().encender(); }
}
