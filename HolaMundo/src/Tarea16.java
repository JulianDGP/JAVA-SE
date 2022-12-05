import java.util.Scanner;

public class Tarea16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []arreglo = new int[10];

        int []ocurrencias= new int[10];

        for (int i =0; i< arreglo.length;i++){
            arreglo[i] = in.nextInt();
            ocurrencias[arreglo[i]] += 1;
        }
        int numOcurrencias=0;
        int numMayor=0;

        for (int i=0; i<ocurrencias.length;i++){
            if (ocurrencias[i]>numOcurrencias){
                numOcurrencias=ocurrencias[i];
                numMayor=i;
            }
        }
        System.out.println("La mayor ocurrencia es = " + numOcurrencias);
        System.out.println("El elemento que mas se repite es = " + numMayor);
        //1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        //1 1  2
    }
}
