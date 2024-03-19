import java.util.Scanner;

public class EjemploArregloNumMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner in = new Scanner(System.in);

        int posicionDelmayor=0;
        for (int i=0; i<a.length;i++){
            a[i] = in.nextInt();
        }

        for (int i=0; i<a.length;i++){
            if(a[i] > a[posicionDelmayor]){
                posicionDelmayor= i;
            }
        }
        System.out.println(a[posicionDelmayor]);

    }
}
