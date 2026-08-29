public class RetoModeloCursos {
    static class Curso { final String codigo; Curso(String codigo){this.codigo=codigo;} }
    static class Estudiante { final String nombre; Estudiante(String nombre){this.nombre=nombre;} }
    static class Inscripcion { final Curso curso; final Estudiante estudiante; Inscripcion(Curso c, Estudiante e){curso=c;estudiante=e;} }
    public static void main(String[] args){ Inscripcion i=new Inscripcion(new Curso("POO-01"),new Estudiante("Aprendiz")); System.out.println(i.curso.codigo); }
}
