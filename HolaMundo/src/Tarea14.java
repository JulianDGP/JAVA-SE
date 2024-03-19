import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {
        int[] arreglo = new int[7];
        Scanner in = new Scanner(System.in);
        int posNumMayor=0;
        for (int i =0; i< arreglo.length;i++){
            arreglo[i]= in.nextInt();
            if (arreglo[i]> arreglo[posNumMayor]){
                posNumMayor=i;
            }
        }
        System.out.println("El numero mayor es: " + arreglo[posNumMayor] + "y se encuentra en la posicion:" + posNumMayor);
    }
}
