public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque(50);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS,motorSubaru);

        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS, motorSubaru, estanqueSubaru);


        System.out.println(mazda.acelerarFrenar((400)));

        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,0.6f));
        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,60));

        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.PICKUP);

        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(nissan);
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println(tipoSubaru.getNumeroPuertas());
    }
}
