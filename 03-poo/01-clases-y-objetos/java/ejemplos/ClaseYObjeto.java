public class ClaseYObjeto {
    static class Curso {
        String titulo;
    }

    public static void main(String[] args) {
        // new crea un objeto concreto a partir de la clase Curso.
        Curso curso = new Curso();
        curso.titulo = "Java básico";
        System.out.println(curso.titulo);
    }
}
