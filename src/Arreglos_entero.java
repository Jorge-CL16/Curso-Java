public class Arreglos_entero {
    public static void main(String[] args) {

        //declaracion de un array
        int[] numeros;

        //Creacion de un array
        numeros = new int[5];


        //inicializar un array forma 1
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;



        //inicializar un array forma 2
        int[] valores = {123, 254, 457};


        //consultar un array
        System.out.println(numeros[3]);
        System.out.println(valores[2]);
    }
}
