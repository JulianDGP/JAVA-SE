import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        String resultado = (numero1>numero2)? numero1 + " es el mayor y " + numero2 +" es el menor":
                numero2 + "es el mayor y " + numero1 +"es el menor";
        System.out.println("resultado = " + resultado);
    }
}