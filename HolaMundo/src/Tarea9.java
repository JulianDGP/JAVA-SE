import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primero = in.nextInt();;
        int segundo = in.nextInt();
        int multiplicacion =0;

        for (int i=0; i<segundo; i++){
            multiplicacion +=primero;
        }
        System.out.println("Resultado ="+ multiplicacion);
    }
}
