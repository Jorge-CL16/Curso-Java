import java.util.Scanner;

public class Clase_String {

    public static void main(String[] args) {
        String palabra1, palabra2;

        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese primera palabra...");
        palabra1 = entrada.next();

        System.out.println("Ingrese palabra 2...");
        palabra2 = entrada.next();

        //Comparar textos
        if (palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " es igual a: " + palabra2);
        } else {
            System.out.println("No son palabras iguales");
        }

        //Comparar textos sin tomar en cuenta mayusculas
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println(palabra1 + " es igual a " + palabra2 + "\n" +
                    " sin tomar en cuenta las mayusculas");
        } else {
            System.out.println(palabra1 + " no es igual a " + palabra2 + "\n" +
                    " sin tomar en cuenta las mayusculas");
        }

        //comparar cantidad de caracteres
        if (palabra1.compareTo(palabra2) == 0) {
            System.out.println(palabra1 + " Tiene las mismas letras que: " + palabra2);
        } else {
            if (palabra1.compareTo(palabra2) > 0) {
                System.out.println(palabra1 + " tiene mas letras que: " + palabra2);
            } else {
                System.out.println(palabra1 + " tiene menos letras que: " + palabra2);
            }
        }

        //saber posicion de un caracter de una palabra
        char caracter = palabra1.charAt(0);
        System.out.println("Primera letra de " + palabra1 + " es: " + caracter);


        //Cantidad de caracteres de un texto
        System.out.println("Cantidad de caracteres de la palabra " + palabra1 + ":" + palabra1.length());

        System.out.println("Cantidad de caracteres de la palabra " + palabra2 + ":" + palabra2.length());

        //Idetificar varios caracteres en un texto o palabra
        System.out.println("Primeras 3 letras de la palabra " + palabra1 + ":" + palabra1.substring(0, 3));

        //buscar caracteres que coincidad en dos palabras
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia == -1)
            System.out.println(palabra1 + " no contiene: " + palabra2);
        else
            System.out.println(palabra1 + " tiene coincidencia con: " + palabra2);

        //llevar a masyuculas
        System.out.println(palabra1 + " en mayusculas es: " + palabra1.toUpperCase());

        //llevar a minuscula
        System.out.println(palabra1 + " en minusculas es: " + palabra1.toLowerCase());
    }
}
