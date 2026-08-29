import java.util.ArrayList;
import java.util.List;
public class IntegracionCursos {
    interface Evaluable { double progreso(); }
    static class Participante { final String nombre; Participante(String nombre){this.nombre=nombre;} }
    static class Inscripcion implements Evaluable { final Participante participante; private double avance; Inscripcion(Participante p){participante=p;} void actualizar(double avance){ if(avance<0||avance>100) throw new IllegalArgumentException(); this.avance=avance; } public double progreso(){return avance;} }
    static class Curso { final String titulo; final List<Inscripcion> inscripciones=new ArrayList<>(); Curso(String titulo){this.titulo=titulo;} void inscribir(Participante p){inscripciones.add(new Inscripcion(p));} }
    public static void main(String[] args){ Curso c=new Curso("POO"); c.inscribir(new Participante("Aprendiz")); System.out.println(c.inscripciones.size()); }
}
