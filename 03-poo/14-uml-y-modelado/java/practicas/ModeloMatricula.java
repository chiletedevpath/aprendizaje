public class ModeloMatricula {
    static class Alumno { final String nombre; Alumno(String n){nombre=n;} }
    static class Asignatura { final String nombre; Asignatura(String n){nombre=n;} }
    static class Matricula { final Alumno alumno; final Asignatura asignatura; Matricula(Alumno a,Asignatura s){alumno=a;asignatura=s;} }
    public static void main(String[] args){ System.out.println(new Matricula(new Alumno("Ana"),new Asignatura("POO")).asignatura.nombre); }
}
