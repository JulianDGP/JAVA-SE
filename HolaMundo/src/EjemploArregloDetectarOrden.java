public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int a[] = new int[5];
        boolean esAscendente=false;
        boolean esDescendente = false;

        for(int i =0; i< a.length-1; i++){

            if(a[i]> a[i+1]){
                esAscendente =true;
            }
            if (a[i]< a[i+1]){
                esDescendente = true;
            }
        }
        if (esAscendente == true && esDescendente==false){
            System.out.println("Es ascendente");
        }else if(esAscendente == false && esDescendente==true){
            System.out.println("Es Descendente");
        } else if (esAscendente == true && esDescendente==true) {
            System.out.println("Esta desordenado");
        }else {
            System.out.println("Son iguales");
        }
    }
}
