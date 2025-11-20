public class Bucle_For {

    public static void main(String[] args){


        /*
        //bucle ascendente
        for (int i = 1; i <= 10; i++){
            System.out.println("vuelta numero: " + i);
        }

        //bucle descendente
        for (int j = 10; j >= 0; j--){
            System.out.println("vuelta numero: " + j);
        }
        */

        int suma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("numero:" + i);

            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("La suma total de los numero pares que hay del 1 al 10 es: " + suma);


    }
}
