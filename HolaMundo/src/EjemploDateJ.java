import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploDateJ {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fechaformateada = formato.format(fecha);

        System.out.println("fechaformateada = " + fechaformateada);
    }
}
