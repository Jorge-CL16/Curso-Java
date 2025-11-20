import java.util.Scanner;

public class Bucle_Do_While {
    public static void main(String[] args){
        int contador = 1;
        final var valor = 5;

        /*
        do {
            System.out.println("Valor " + contador++);
        } while(contador <= valor);*/

        Scanner entrada = new Scanner(System.in);

        /*int numero = 0;
        int errores = 0;

        do {
            System.out.println("Ingresa el numero 5...");
            numero = entrada.nextInt();
            if (numero != 5){
                System.out.println("No ingresaste el numero 5");
                errores++;
            }
        }while (numero != 5);
        System.out.println("Gracias fallaste: " + errores + " veces");
        */

        int numero = 0;
        int errores = 0;


        while (numero != 5){
            System.out.println("Ingresa el numero 5...");
            numero = entrada.nextInt();
            errores++;

            if (numero == 5)
                break;
        }
        System.out.println("Gracias fallaste: " + errores + " veces");

    }
}
