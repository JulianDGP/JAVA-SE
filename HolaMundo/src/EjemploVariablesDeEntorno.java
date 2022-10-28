import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        String usermane = System.getenv("USERNAME");
        System.out.println("usermane = " + usermane);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String temDIR = System.getenv("TEMP");
        System.out.println("temDIR = " + temDIR);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        for(String key: varEnv.keySet() ){
            System.out.println(key +"=>" + varEnv.get(key));
        }

    }
}
