import java.util.Scanner;

public class Tarea7
{
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        Scanner in = new Scanner(System.in);
        int cantidadNumeros = in.nextInt();

        int menor= Integer.MAX_VALUE;

        for (int i=0; i< cantidadNumeros; i++){
            int numero = in.nextInt();
            if(i==0){
                menor= numero;
            }
            if(numero<menor){
                menor=numero;
            }

        }
        System.out.println("el numero menor es = " + menor);
        if (menor < 10){
            System.out.println("Y es menor que 10!");
        }else{
            System.out.println("Y es mayor o igual que 10!");
        }
    }
}
