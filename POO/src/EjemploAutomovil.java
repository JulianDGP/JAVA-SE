public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();

        System.out.println(subaru.verDetalle());
        Automovil mazda = new Automovil();
        System.out.println(mazda.verDetalle());

        System.out.println(mazda.acelerarFrenar((400)));

        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,0.6f));
        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,60));

    }
}
