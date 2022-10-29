import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random = " + random);

        Random randomObjc = new Random();
        int randomInt =  randomObjc.nextInt();
        System.out.println("randomInt = " + randomInt);

        String[] colores = {"azul","amarillo","rojo","verde", "blanco","negro" };

        randomInt = randomObjc.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);

        //random de 15 a 17
        randomInt = 15+ randomObjc.nextInt(2);
        System.out.println("randomInt = " + randomInt);
    }
}