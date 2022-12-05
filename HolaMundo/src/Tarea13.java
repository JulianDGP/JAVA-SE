import java.util.Arrays;

public class Tarea13 {
    public static void main(String[] args) {
        int arreglo[] = new int[10];

        for (int i = 0; i< arreglo.length; i++){
            arreglo[i]=i+1;
        }

        int arreglo2[] = new int[10];
        int aux=0;
        for (int i=0; i<arreglo.length -i;i++){
            arreglo2[aux]=  arreglo[i];
            aux++;
            arreglo2[aux]= arreglo[ arreglo.length -1 -i ];
            aux++;
        }

        System.out.println(Arrays.toString(arreglo2));
    }
}
