public class Automovil {
    private final int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;

    private Persona conductor;

    private Rueda[] ruedas;

    private TipoAutomovil tipo;
    private static final Color colorPatente = Color.AMARILLO;
    private static final int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }



    public String acelerar(int rpm) {
        return "el auto" + fabricante + "acelerando a" + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + "frenado!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencima) {
        return km / (this.getEstanque().getCapacidad() * porcentajeBencima);
    }

    public float calcularConsumo(int km, int porcentajeBencima) {

        return km / (this.getEstanque().getCapacidad() * (porcentajeBencima / 100f));

    }


    @Override
    public String toString() {

        String detalle = "Automovil{" + "id="
                + this.id + ", fabricante='"
                + this.getFabricante() + '\''
                + ", modelo='" + this.getModelo();
        if (this.getTipo() != null) {
            detalle += ", tipo=" + this.getTipo().getDescripcion() + '}';
        }
        detalle += '\'' + ", color=" + this.getColor();

        if (this.motor != null) {
            detalle += ", cilindraje=" + this.motor.getCilindrada() + ", capacidadEstanque=";
        }

        return detalle;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
}
