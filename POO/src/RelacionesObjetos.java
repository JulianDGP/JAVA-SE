public class RelacionesObjetos {
    public static void main(String[] args) {
        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru", "Impreza");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque(50);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);



        Persona bea = new Persona("Bea","Gonzalez");
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS, motorSubaru, new Estanque(50));


        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,0.6f));
        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,60));

        subaru.setTipo(TipoAutomovil.HATCHBACK);

        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(nissan);
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println(tipoSubaru.getNumeroPuertas());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
