import javax.swing.*;

public class For_Ejercicio {
    public static void main(String[] args){

        boolean validar = false;

        for (int i = 0; !validar; i++) {
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email");

            if (email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Email ingresado correctamente");
                validar = true;
                break;
            }else if (!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Email no valido debe tener un @");
            } else {
                JOptionPane.showMessageDialog(null, "El correo debe de terminar con .com");
            }
        }
    }
}
