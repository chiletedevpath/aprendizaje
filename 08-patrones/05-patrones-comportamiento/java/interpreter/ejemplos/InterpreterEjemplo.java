public class InterpreterEjemplo {

    interface Expresion { int interpretar(); }
    static class Numero implements Expresion { int n; Numero(int n){this.n=n;} public int interpretar(){return n;} }
    static class Suma implements Expresion { Expresion a,b; Suma(Expresion a,Expresion b){this.a=a;this.b=b;} public int interpretar(){return a.interpretar()+b.interpretar();} }
    public static void main(String[] args) {
        // Interpreter representa una gramática pequeña mediante objetos evaluables.
        System.out.println(new Suma(new Numero(2),new Numero(3)).interpretar());
    }
}
