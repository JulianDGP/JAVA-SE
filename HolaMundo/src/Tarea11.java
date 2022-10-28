import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();

        SimpleDateFormat formatoDeFechaParaOperar = new SimpleDateFormat("yyyyMMdd");
        try {
            Date fechaNacimiento = formatoDeFecha.parse(entrada.next());

            //System.out.println("formatoDeFechaParaOperar.format(fechaNacimiento) = " + formatoDeFechaParaOperar.format(fechaNacimiento));
            //System.out.println("fechaActual = " + formatoDeFechaParaOperar.format(fechaActual));
            int nacimiento = Integer.parseInt(formatoDeFechaParaOperar.format(fechaNacimiento));
            int actual = Integer.parseInt(formatoDeFechaParaOperar.format(fechaActual));

            // Restamos ambas fechas y dividimos en 10000 para quitar decimales
            int edad = (actual-nacimiento)/10000;
            System.out.println("su edad es= " + edad);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
