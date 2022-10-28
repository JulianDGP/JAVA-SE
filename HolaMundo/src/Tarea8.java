import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cantidadDeNotas= 20;
        double sumatoriaTotalNotas=0,sumatoriaMayorA_5=0, cantidadNotasMayorA_5=0, sumatoriaMenorA4=0,
                cantidadNotasMenorA_4=0, cantidadDeNotasDe1=0;

        for (int i=0; i <cantidadDeNotas; i++){
            double nota = in.nextDouble();

            if(nota<1 || nota>7 ){
                System.out.println("Error, no se encuentra dentro del rango");
                System.exit(0);
            } else if (nota==1) {
                sumatoriaTotalNotas +=1;
                sumatoriaMenorA4 +=1;
                cantidadDeNotasDe1++;
                cantidadNotasMenorA_4++;
            } else if (nota<4) {
                sumatoriaTotalNotas += nota;
                sumatoriaMenorA4 += nota;
                cantidadNotasMenorA_4++;
            } else if (nota > 5) {
                sumatoriaTotalNotas +=nota;
                sumatoriaMayorA_5 +=nota;
                cantidadNotasMayorA_5++;
            } else {
                sumatoriaTotalNotas += nota;
            }
        }

        System.out.println( "Hay "+ cantidadNotasMayorA_5 + " notas mayores que 5 con un promedio de =" + (sumatoriaMayorA_5/ cantidadDeNotas));
        System.out.println( "Hay "+ cantidadNotasMenorA_4 + " notas menores que 4 con un promedio de =" + (sumatoriaMenorA4 / cantidadNotasMenorA_4) );
        System.out.println("Hay" + cantidadDeNotasDe1 +" Notas de 1");
        System.out.println("Promedio total de notas =" + (sumatoriaTotalNotas / cantidadDeNotas));
    }
}
