import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        for (int i = 0; i< arreglo.length; i++){
            arreglo[i]=in.nextInt();
            if(arreglo[i]%2==0 ){
                numerosPares.add(arreglo[i]);
            }else{
                numerosImpares.add(arreglo[i]);
            }
        }
        System.out.println("Cantidad de pares");
        for (int i=0; i<numerosPares.size();i++){
            System.out.println("numerosPares.get(i) = " + numerosPares.get(i));
        }

        System.out.println("Cantidad de impares");
        for (int i=0; i<numerosImpares.size();i++){
            System.out.println("numerosPares.get(i) = " + numerosImpares.get(i));
        }

    }
}
