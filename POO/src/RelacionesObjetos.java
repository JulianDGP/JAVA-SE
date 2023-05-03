public class RelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[4] = new Rueda("Yokohama", 16, 7.5);

        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru", "Impreza");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque(50);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Rueda[] ruedaMaz = {new Rueda("Michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5)};
        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(50), pato, ruedaMaz);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(50));
        mazda.setConductor(pato);


        Rueda[] ruedasNissan = {new Rueda("Michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5)};
        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        Rueda[] ruedasNissan2 = {new Rueda("Michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5),
                new Rueda("michelin", 18, 18.5)};
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(5.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);

//
//        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,0.6f));
//        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,60));

//        subaru.setTipo(TipoAutomovil.HATCHBACK);
//
//        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
//        System.out.println(nissan);
//        TipoAutomovil tipoSubaru = subaru.getTipo();
//        System.out.println(tipoSubaru.getNumeroPuertas());
//
//        System.out.println(mazda.calcularConsumo(300,70));

        for (Rueda r : mazda.getRuedas()) {
            System.out.println("fabricante" + r.getFabricante() + ", aro =" + r.getAro() + ", ancho =" + r.getAncho());
        }
        System.out.println("mazda = " + mazda.getConductor().toString());

    }
}

