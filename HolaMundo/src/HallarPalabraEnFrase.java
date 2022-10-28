public class HallarPalabraEnFrase {
    public static void main(String[] args) {
        String frase = "trigotrigotres trigoristes tigres tragan trigo en un trigaltrigotrigo";
        String palabra = "trigo";

        int tamañoFrase= frase.length();
        int tamañopalabra = palabra.length();

        int vecesQueSeRepite =0;

        iterarFrase : for(int i=0; i<tamañoFrase; ){
            int k=i;

            iterarPalabra:
            for(int j=0; j<tamañopalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue iterarFrase;
                }
            }
            vecesQueSeRepite++;
            i= i+ tamañopalabra; //como ya encontró la palabra salta el tamaño de la palabra en la frase para no iterarla de nuevo innecesariamente
        }
        System.out.println("vecesQueSeRepite = " + vecesQueSeRepite);
    }
}
