import java.util.Scanner;

public class Arreglos_mayor_valor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;

        //llenado array
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese valor " + i);
            numeros[i] = entrada.nextInt();

            //analiza mayor valor
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("Mayor valor ingresado: " + mayor);
    }
}
