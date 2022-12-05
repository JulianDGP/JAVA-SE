import java.util.ArrayList;
import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []numeros = new int[7];
        int nCeros=0;
        ArrayList<Integer> positivos = new ArrayList<Integer>();
        ArrayList<Integer> negativos = new ArrayList<Integer>();

        for(int i=0; i<numeros.length; i++){
            numeros[i] = in.nextInt();
            if (numeros[i] >0){
                positivos.add(numeros[i]);
            } else if (numeros[i]<0) {
                negativos.add(numeros[i]);
            }else {
                nCeros++;
            }
        }
        double sumPositivos =0;
        for (int i=0; i<positivos.size();i++ ){
            sumPositivos+= positivos.get(i);
        }

        double sumNegativos =0;
        for (int i=0; i<negativos.size();i++ ){
            sumNegativos+= negativos.get(i);
        }
        System.out.println("sumPositivos = " + sumPositivos/positivos.size());
        System.out.println("sumNegativos = " + sumNegativos/negativos.size());
        System.out.println("nCeros = " + nCeros);

    }
}
