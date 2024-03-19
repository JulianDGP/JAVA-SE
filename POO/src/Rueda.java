public class Rueda {
    private final String fabricante;
    private final int aro;
    private final double ancho;

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
