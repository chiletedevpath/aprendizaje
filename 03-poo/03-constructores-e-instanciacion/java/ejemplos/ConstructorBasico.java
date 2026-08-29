public class ConstructorBasico {
    static class Curso {
        final String titulo;

        Curso(String titulo) {
            // El constructor recibe los datos necesarios para iniciar el objeto.
            this.titulo = titulo;
        }
    }

    public static void main(String[] args) {
        Curso curso = new Curso("POO");
        System.out.println(curso.titulo);
    }
}
