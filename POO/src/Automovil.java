public class Automovil {
    private String fabricante;
    private String modelo;
    private String color= "gris";
    double cilindraje;
    int capacidadEstanque=40;

    public String getFabricante(){
        return fabricante;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public double getCilindraje(){
        return cilindraje;
    }
    public int getCapacidadEstanque(){
        return capacidadEstanque;
    }
    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append(" auto.color = " + this.color);
        sb.append(" auto.modelo = " + this.modelo);
        sb.append(" auto = " + this.cilindraje);
        return sb.toString();
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
}
