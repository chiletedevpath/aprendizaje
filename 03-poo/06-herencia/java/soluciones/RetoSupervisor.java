public class RetoSupervisor {
    static class Empleado {
        protected final String nombre;
        Empleado(String nombre) { this.nombre = nombre; }
        String responsabilidad() { return "Ejecutar tareas"; }
    }
    static class Supervisor extends Empleado {
        Supervisor(String nombre) { super(nombre); }
        @Override String responsabilidad() { return "Coordinar al equipo"; }
    }
    public static void main(String[] args) { System.out.println(new Supervisor("Luis").responsabilidad()); }
}
