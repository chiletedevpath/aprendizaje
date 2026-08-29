public class ModeloUml {
    static class Estudiante { final String nombre; Estudiante(String nombre){this.nombre=nombre;} }
    static class Curso { final String titulo; Curso(String titulo){this.titulo=titulo;} }
    static class Inscripcion {
        // La clase materializa la relación entre Estudiante y Curso.
        final Estudiante estudiante;
        final Curso curso;
        Inscripcion(Estudiante e, Curso c){estudiante=e;curso=c;}
    }
    public static void main(String[] args){ Inscripcion i=new Inscripcion(new Estudiante("Ana"),new Curso("POO")); System.out.println(i.estudiante.nombre+" - "+i.curso.titulo); }
}
