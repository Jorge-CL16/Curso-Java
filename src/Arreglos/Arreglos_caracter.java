package Arreglos;

import java.util.Arrays;

public class Arreglos_caracter {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "manzanas";
        productos[1] = "uvas";
        productos[2] = "peras";
        productos[3] = "fresas";
        productos[4] = "kiwi";

        Arrays.sort(productos);

        System.out.println("Productos " + productos[0]);
        System.out.println("Prodctots " + productos[1]);
        System.out.println("Prodctots " + productos[2]);
        System.out.println("Prodctots " + productos[3]);
        System.out.println("Prodctots " + productos[4]);
    }
}
