import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

            try {
                if(System.getProperty("os.name").startsWith("Windows")){
                    proceso = rt .exec("notepad");
                }else{
                    proceso = rt.exec("gedit");
                }
                proceso.waitFor();
            } catch (IOException | InterruptedException e) {
                System.err.print("el mensaje xd "+ e.getMessage());
            }
        System.out.println(" se ha cerrado el proceso");
        System.out.println(" = prueba");
    }

}
