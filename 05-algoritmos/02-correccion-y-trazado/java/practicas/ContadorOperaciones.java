public class ContadorOperaciones {
    public static void main(String[] args){int[] a={4,7,1,9,3};int comparaciones=0,max=a[0];for(int i=1;i<a.length;i++){comparaciones++;if(a[i]>max)max=a[i];}System.out.println("Máximo="+max+", comparaciones="+comparaciones);}
}
