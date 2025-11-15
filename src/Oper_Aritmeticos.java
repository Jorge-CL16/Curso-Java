import java.util.Scanner;

public class Oper_Aritmeticos {
    public static void main(String[] args){

        //Inicializacion de variables
        int valor1, valor2, resultado;

        //Operador suma
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese valor 1...");
        valor1 = entrada.nextInt();

        System.out.println("Ingrese valor 2...");
        valor2 = entrada.nextInt();


        //Operacion Suma
        resultado = valor1 + valor2;
        System.out.println("Suma es igual a: " + resultado);

        //Operación Resta
        resultado = valor1 - valor2;
        System.out.println("Resta es igual a: " + resultado);

        //Operacion Multiplicacion
        resultado = valor1 * valor2;
        System.out.println("Multiplicacion es igual a: " + resultado);

        //Operacion division
        resultado = valor1 / valor2;
        System.out.println("División es igual a: " + resultado);

        //Operacion residuo
        resultado = valor1 % valor2;
        System.out.println("Residuo es igual a: " + resultado);
    }
}
