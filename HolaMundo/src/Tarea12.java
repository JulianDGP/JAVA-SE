import java.util.Scanner;

public class Tarea12 {

    public static void main(String[] args) {

        System.out.println("Ingrese el radio del circulo");
        Scanner in = new Scanner(System.in);
        double radio = in.nextDouble();
        double area =  Math.PI * (Math.pow(radio, 2)) ;
        System.out.println("area = " + area);
    }
}
