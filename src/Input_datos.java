import java.util.Scanner;

public class Input_datos {

    public static void main(String[] args){

        String nombre;
        int edad;

        //Ingreso de datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre...");
        nombre = entrada.next();

        System.out.println("Escribe tu edad...");
        edad = entrada.nextInt();

        //Salida de datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
