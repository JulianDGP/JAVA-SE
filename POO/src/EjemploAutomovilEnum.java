public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
//
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(2.0, TipoMotor.BENCINA));
//
//        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS, 3.5, 50);
//
//
//        System.out.println(mazda.acelerarFrenar((400)));
//
//        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,0.6f));
//        System.out.println("kilomentros por litro"+ subaru.calcularConsumo(300,60));

        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.PICKUP);

//        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
//        System.out.println(nissan);
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println(tipo.getNumeroPuertas());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE -> System.out.println(" el auto es deportivo y descapotado de dos puertas");

            case COUPE -> System.out.println("es automovil pequeño de dos puertas y tipicamente deportivo");

            case FURGON -> System.out.println("Es un automovil utilizado apra transporte en empresas");

            case HATCHBACK -> System.out.println("Automovil mediano compacto");

            case PICKUP -> System.out.println("de doble cabina");

            case SEDAN -> System.out.println("Automovil mediano");

            case STATION_WAGON -> System.out.println("Automovil con maleta grande");

        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos
        ) {
            System.out.print(ta + "=>" + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas() + ", ");
            System.out.println();
        }

    }
}
