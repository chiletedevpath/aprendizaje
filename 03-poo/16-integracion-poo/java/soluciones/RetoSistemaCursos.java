import java.util.ArrayList;
import java.util.List;
public class RetoSistemaCursos {
    static class Participante { final String id,nombre; Participante(String id,String nombre){this.id=id;this.nombre=nombre;} }
    static class Curso { final String codigo,titulo; Curso(String codigo,String titulo){this.codigo=codigo;this.titulo=titulo;} }
    static class Inscripcion { final Participante participante; final Curso curso; private int avance; Inscripcion(Participante p,Curso c){participante=p;curso=c;} void actualizarAvance(int v){if(v<0||v>100)throw new IllegalArgumentException();avance=v;} int getAvance(){return avance;} }
    static class Gestor { final List<Inscripcion> inscripciones=new ArrayList<>(); void inscribir(Participante p,Curso c){inscripciones.add(new Inscripcion(p,c));} }
    public static void main(String[] args){ Gestor g=new Gestor(); g.inscribir(new Participante("P1","Ana"),new Curso("C1","POO")); System.out.println(g.inscripciones.size()); }
}
