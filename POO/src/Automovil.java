public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color= Color.GRIS;
    private double cilindraje;
    private int capacidadEstanque=40;

    private TipoAutomovil tipo;
    private static Color colorPatente = Color.AMARILLO;
    private static  int capacidadEstanqueEstatico =30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA =120;
    public static final int VELOCIDAD_MAX_CIUDAD =60;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindraje){
        this(fabricante, modelo,color);
        this.cilindraje = cilindraje;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindraje, int capacidadEstanque) {
        this(fabricante, modelo,color, capacidadEstanque);
        this.capacidadEstanque = capacidadEstanque;
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

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public  String acelerar(int rpm){
        return "el auto" + fabricante + "acelerando a"
 + rpm +"rpm";
    }
    public String frenar(){
        return  this.fabricante + " "+ this.modelo + "frenado!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return  acelerar +"\n"+ frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencima){
        return km/(capacidadEstanque*porcentajeBencima);
    }
    public float calcularConsumo(int km, int porcentajeBencima){
        return km/(capacidadEstanque*(porcentajeBencima/100f));
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + this.id +
                ", fabricante='" + this.getFabricante() + '\'' +
                ", modelo='" + this.getModelo() + '\'' +
                ", color=" + this.getColor() +
                ", cilindraje=" + this.getCilindraje() +
                ", capacidadEstanque=" + this.getCapacidadEstanque() +
                ", tipo=" + this.getTipo().getDescripcion() +
                '}';
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
}
