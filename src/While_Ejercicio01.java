import javax.swing.*;

public class While_Ejercicio01 {
    public static void main(String[] args) {

        final String u_correcto = "Usuario01";
        final String p_correcto = "Abc123%";

        String username, password;
        int intentos = 0;
        final int max_intentos = 3;

        while(intentos < max_intentos){

            username = JOptionPane.showInputDialog(null, "Ingresa tu nombre de usuarios");
            password = JOptionPane.showInputDialog(null, "Ingresa tu contraseña");

            if (username.equals(u_correcto) && password.equals(p_correcto)){
                JOptionPane.showMessageDialog(null, "Accesso correcto" + "\n"
                                                                                + " Bienvenid@ " + u_correcto);
            break;
            }else {
                intentos++;
                JOptionPane.showMessageDialog(null,"Usuario o claves incorrectos"
                                                                            + " Intente de nuevo");
            }

            if (intentos > 2){
                JOptionPane.showMessageDialog(null, "Intentos de acceso axcedidos contacte a soporte");
                break;
            }
        }
    }
}
