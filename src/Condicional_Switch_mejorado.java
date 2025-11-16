import java.util.Scanner;

public class Condicional_Switch_mejorado {
    public static void main(String[] args){

        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese dia a consultar");
        diaSemana = entrada.nextInt();

        switch (diaSemana){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero incorrecto, saliendo del sistema");
        }
    }
}
