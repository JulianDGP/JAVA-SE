import java.io.Console;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ja = "uno.2.3.4.5.6";
        String [] arreglo = ja.split("\\.");

        for ( int i=0; i< arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        String nombre1= entrada.nextLine();
        String nombre2= entrada.nextLine();
        String nombre3= entrada.nextLine();

        int l = nombre1.length();
        int l2 = nombre2.length();
        int l3 = nombre3.length();

        nombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.charAt(l-2)+ nombre1.charAt(l-1) ;
        nombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.charAt(l2-2)+ nombre2.charAt(l2-1) ;
        nombre3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.charAt(l3-2)+ nombre3.charAt(l3-1) ;

        System.out.println("nombre1 = " + nombre1 + "_" + nombre2 + "_"+ nombre3);
    }
}
