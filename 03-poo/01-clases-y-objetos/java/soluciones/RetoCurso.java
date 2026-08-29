public class RetoCurso {
    static class Curso {
        String titulo;
        int duracionHoras;

        void mostrarFicha() {
            System.out.printf("%s - %d horas%n", titulo, duracionHoras);
        }
    }

    public static void main(String[] args) {
        Curso java = new Curso();
        java.titulo = "Java";
        java.duracionHoras = 20;

        Curso scala = new Curso();
        scala.titulo = "Scala";
        scala.duracionHoras = 16;

        java.mostrarFicha();
        scala.mostrarFicha();
    }
}
