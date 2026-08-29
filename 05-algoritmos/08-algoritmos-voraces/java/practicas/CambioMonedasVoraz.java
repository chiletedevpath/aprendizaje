public class CambioMonedasVoraz {
    public static void main(String[]args){int monto=87;int[]m={50,20,10,5,2,1};for(int moneda:m){int cantidad=monto/moneda;if(cantidad>0){System.out.println(moneda+" -> "+cantidad);monto%=moneda;}}}
}
