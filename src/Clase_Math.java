import java.util.Scanner;

public class Clase_Math {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        //Calculo de raiz cuadrada
        System.out.println("Ingrese un valor a calcular");
        int valor = entrada.nextInt();

        System.out.println("Raiz de:" + valor + "=" + Math.sqrt(valor));

        //calculo de potencia
        var base = 2;
        var exponente = 3;

        System.out.println("Potencia de 2 a la 3 = " + Math.pow(base, exponente));

        //valor absoluto de un numero
        var absoluto = 2.5;
        System.out.println("Valor absoluto de: " + absoluto + " = " + Math.abs(absoluto));

        //identificar mayor valor
        var numero1 = 50.2;
        var numero2 = 3;
        System.out.println("Mayor valor: " + Math.max(numero1,numero2));

        //redondear un valor a entero mas cercano
        var total = 5.2826;
        System.out.println(total + " redondeado es:" + Math.round(total));

        //redondear hacia abajo
        System.out.println(total + " redondeado hacia abajo:" + Math.floor(total));

        //redondear hacia ariiba
        System.out.println(total + " redondeado hacia arriba:" + Math.ceil(total));

        //numero aleatorio
        var aleatorio = Math.random();
        System.out.println("Numero aleatorio:" + aleatorio);

    }
}
