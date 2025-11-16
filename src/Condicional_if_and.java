import javax.swing.*;

public class Condicional_if_and {
    public static void main(String[] args){

        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre..");

        String edad2 = JOptionPane.showInputDialog(null, "Ingresa tu edad..");
        edad = Integer.parseInt(edad2);

        //analizando datos

        if (edad < 12){
            JOptionPane.showMessageDialog(null, "Eres un niño");
        } else if(edad > 12 && edad < 19) {
           JOptionPane.showMessageDialog(null, "Eres un adolescente");
        } else{
          JOptionPane.showMessageDialog(null, "Eres un adulto");
        }

    }
}
