import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gas = sc.nextDouble();

        if(gas ==70){
            System.out.println("Estanque lleno");
        } else if ( gas>=60 && gas<70 ) {
            System.out.println("Estanque casi lleno");
        } else if (gas>=40 && gas<60 ) {
            System.out.println("Estanque  3/4");
        } else if (gas >=35 && gas<40) {
            System.out.println("Medio Estanque ");
        } else if (gas >=20 && gas <35) {
            System.out.println("Suficiente");
        } else if (gas>=1 && gas<20) {
            System.out.println("Insuficiente");
        }
    }
}

