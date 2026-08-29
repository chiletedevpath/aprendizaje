public class DosPunteros {
    static boolean sumaObjetivo(int[]a,int objetivo){int i=0,j=a.length-1;while(i<j){int s=a[i]+a[j];if(s==objetivo)return true;if(s<objetivo)i++;else j--;}return false;}
    public static void main(String[]args){System.out.println(sumaObjetivo(new int[]{1,3,4,6,8,10},14));}
}
