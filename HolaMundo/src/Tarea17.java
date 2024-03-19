import java.util.Scanner;

public class Tarea17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[12];
        int[] histograma = new int[7];

        for (int i=0; i<valores.length; i++){
            valores[i] = in.nextInt();
            histograma[valores[i]] +=1;

        }
        String asterisco = "*";
        for ( int i =1; i<histograma.length; i++){
            System.out.println(i+": " + asterisco.repeat(histograma[i]));
        }

    }
}