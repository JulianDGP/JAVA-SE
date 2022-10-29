public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        int absoluto2 = Math.abs(-3);
        System.out.println("absoluto2 = " + absoluto2);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double redondeaArriba = Math.ceil(3.4);
        System.out.println("redondeaArriba = " + redondeaArriba);

        double redondeAbajo = Math.floor(3.6);
        System.out.println("redondeAbajo = " + redondeAbajo);

        long entero= Math.round(3.5);
        System.out.println("entero = " + entero);

        double euler = Math.exp(1);
        System.out.println("euler = " + euler);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);

        System.out.println("convertir radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convierte de grados a radianes = " + radianes);


        System.out.println("seno de 90"+ Math.sin(90.00));
        System.out.println("Coseno de 90:" + Math.cos(90.00));



    }
}