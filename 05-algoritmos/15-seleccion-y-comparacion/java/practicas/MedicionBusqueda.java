public class MedicionBusqueda {
    public static void main(String[]args){int[]a=new int[100000];for(int i=0;i<a.length;i++)a[i]=i;long t=System.nanoTime();int pos=java.util.Arrays.binarySearch(a,99999);long d=System.nanoTime()-t;System.out.println("pos="+pos+", ns="+d);System.out.println("Una medición aislada no sustituye el análisis de complejidad.");}
}
