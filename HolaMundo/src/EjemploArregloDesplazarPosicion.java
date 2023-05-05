import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {
        int []a = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i< a.length;i++){
            a[i] = in.nextInt();
        }

        int nFinal =a[a.length-1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0]=nFinal;

        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
}
