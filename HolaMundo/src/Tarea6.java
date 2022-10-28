import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Type your name please");
        String name2 = JOptionPane.showInputDialog("Type your name please");
        String name3 = JOptionPane.showInputDialog("Type your name please");

        if(name1.length()>name2.length() && name1.length()>name3.length()){
            System.out.println(name1.split(" ")[0] + " Tiene el nombre mas largo" );
        } else if (name2.length()> name1.length() && name2.length()> name3.length()) {
            System.out.println(name2.split(" ")[0] + " Tiene el nombre mas largo" );
        } else if (name3.length()> name1.length() && name3.length()> name2.length()) {
            System.out.println(name3.split(" ")[0] + " Tiene el nombre mas largo");
        }
    }
}
