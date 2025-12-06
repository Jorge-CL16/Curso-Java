package Arreglos;

public class Matrices_For {
    public static void main(String[] args) {

        int[][] cantidades = {
                {10,20,80,20},
                {50,70,10,70},
                {40,30,90,50}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cantidades[i][j] + " ");
            }
            System.out.println();
        }


    }
}
