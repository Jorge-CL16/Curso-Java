import java.util.Scanner;

public class Bucle_While {
    public static void main(String[] args) {

        //int f = 0;
        //Ejemplo basico
        //bucle While
        /*while (f < 5){
            System.out.println("Vuelta no.:" + f);

            if (f==3)
                System.out.println("Soy la vuelta 3");

            f++;
        }*/

        //tabla de multiplicar

        Scanner entrada = new Scanner(System.in);

        int tabla = 0;
        int i = 1;
        int resultado = 0;

        System.out.println("Escribe la tabla de multiplicar que quieras hacer");
        tabla = entrada.nextInt();

        while (i <= 10){
            resultado = tabla * i;
            System.out.println(tabla + "x" + i + "=" + resultado );
            i++;
        }



    }
}
