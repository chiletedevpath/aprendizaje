public class HerenciaBasica {
    static class Empleado { String nombre; Empleado(String nombre){this.nombre=nombre;} }
    static class Supervisor extends Empleado {
        Supervisor(String nombre) { super(nombre); }
        void coordinar() { System.out.println(nombre + " coordina el equipo"); }
    }
    public static void main(String[] args) { new Supervisor("Ana").coordinar(); }
}
