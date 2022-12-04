public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo){

        int contador=0;
        for(int i =0; i< arreglo.length-1;i++){
            for(int j=0; j< arreglo.length-1 -i; j++){
                if(  ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) <0){
                    Object aux = arreglo[j];
                    arreglo[j] =arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
        for (int i=0; i< arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
    public static void main(String[] args) {

        String[] arreglo = {"Kingston pendrive", "Samsung Galaxy", "Disco Duro SSD Samsung",
        "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};

        sortBurbuja(arreglo);

        Integer numeros[] = new Integer[4];
        numeros[0] = 10;
        numeros[1]= 7;
        numeros[2]=35;
        numeros[3]=-1;
        sortBurbuja(numeros);

    }
}
