public class ClaseEInstancia {
    static class Usuario {
        private static int creados;
        private final String nombre;
        Usuario(String nombre){ this.nombre=nombre; creados++; }
        static int getCreados(){ return creados; }
        String getNombre(){ return nombre; }
    }
    public static void main(String[] args){ new Usuario("Ana"); new Usuario("Luis"); System.out.println(Usuario.getCreados()); }
}
