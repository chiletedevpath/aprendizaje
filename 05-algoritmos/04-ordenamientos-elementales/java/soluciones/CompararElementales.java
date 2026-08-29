import java.util.*;
public class CompararElementales {
    static void bubble(int[] a){for(int f=a.length-1;f>0;f--)for(int i=0;i<f;i++)if(a[i]>a[i+1]){int t=a[i];a[i]=a[i+1];a[i+1]=t;}}
    public static void main(String[] args){int[] a={5,1,4,2,8};bubble(a);System.out.println(Arrays.toString(a));}
}
