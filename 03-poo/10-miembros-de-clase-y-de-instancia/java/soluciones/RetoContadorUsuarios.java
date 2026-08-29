public class RetoContadorUsuarios {
    static class Usuario {
        private static int total;
        Usuario(){ total++; }
        static int totalCreados(){ return total; }
    }
    public static void main(String[] args){ new Usuario(); new Usuario(); new Usuario(); System.out.println(Usuario.totalCreados()); }
}
