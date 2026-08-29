public class CursoCompleto {
    static class CupoAgotadoException extends Exception { CupoAgotadoException(){super("El curso no tiene cupos disponibles");} }
    static class Curso { private int cupos=1; void inscribir() throws CupoAgotadoException { if(cupos==0) throw new CupoAgotadoException(); cupos--; } }
    public static void main(String[] args){ Curso c=new Curso(); try{c.inscribir();c.inscribir();}catch(CupoAgotadoException e){System.out.println(e.getMessage());} }
}
