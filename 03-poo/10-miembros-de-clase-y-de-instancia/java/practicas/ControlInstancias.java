public class ControlInstancias {
    static class Conexion {
        private static int activas;
        Conexion(){ activas++; }
        void cerrar(){ if(activas>0) activas--; }
        static int activas(){ return activas; }
    }
    public static void main(String[] args){ Conexion a=new Conexion(); Conexion b=new Conexion(); a.cerrar(); System.out.println(Conexion.activas()); }
}
