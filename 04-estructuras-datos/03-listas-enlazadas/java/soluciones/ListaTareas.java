public class ListaTareas { static class N{String c;N s;N(String c){this.c=c;}} public static void main(String[]a){N h=new N("T1"); h.s=new N("T2"); System.out.println(h.c+" -> "+h.s.c);} }
