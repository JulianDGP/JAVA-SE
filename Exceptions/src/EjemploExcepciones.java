import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) throws FormatoNumeroException {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog(("ingrese un entero"));
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);

            double division2 = cal.dividir("10", "2");
            System.out.println("division2 = " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepcion, ingrese un numero valido" + nfe.getMessage());
            main(args);
        }
        catch (FormatoNumeroException e) {
            System.out.println("Se detecto una excepcion, ingrese un numero valido" + e.getMessage());
            e.printStackTrace(System.out);
        } catch (DivisionPorCeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucuion" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("continua el flujo");
        }
    }
}