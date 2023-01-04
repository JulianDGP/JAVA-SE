import java.util.Scanner;

public class Tarea19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz n x n:");
        int n =  entrada.nextInt();
        int [][] matriz =new int[n][n];

        if (n==0){
            System.out.println("ERROR");
            System.exit(1);

        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if ((j==0) ||  i== n/2 || (j== n-1 && i>n/2) ){
                    matriz[i][j]=1;
                }
            }

            System.out.println();
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
