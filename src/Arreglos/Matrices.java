package Arreglos;

public class Matrices {
    public static void main(String[] args){

        int[][] numeros = new int[3][3];

        //Llenando fila 1 de la matriz
        numeros[0][0] = 8;
        numeros[0][1] = 7;
        numeros[0][2] = 6;
        //llenando fila 2 de la matriz
        numeros[1][0] = 5;
        numeros[1][1] = 4;
        numeros[1][2] = 3;
        //llanado fila 3 de la matriz
        numeros[2][0] = 2;
        numeros[2][1] = 1;
        numeros[2][2] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}
