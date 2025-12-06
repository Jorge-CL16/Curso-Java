import java.util.Arrays;

public class Arreglos_Metodos {
    public static void main(String[] args){
        int[] numeros = {8,3,1,2,4,7,6,5};
        String[] letras = {"b", "t", "a", "y"};
        //Ver valores como texto
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array original: " + Arrays.toString(letras));

        //organizar un array de enteros y strings
        Arrays.sort(numeros);
        System.out.println("Array organizadp: " + Arrays.toString(numeros));
        Arrays.sort(letras);
        System.out.println("Array organizadp: " + Arrays.toString( letras));

        //Comparar valores de array
        int[] numeros1 = {1,2,3};
        int[] numeros2 = {1,2,3};
        boolean iguales = Arrays.equals(numeros1,numeros2);
        System.out.println("Son iguales: " + iguales);


        //como llenar un array automaticamente
        int[] llenar = new int[5];
        Arrays.fill(llenar,1);
        System.out.println("Llenado: " + Arrays.toString(llenar));

        //como copiar un array
        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original, 3);
        System.out.println("Copiado: " + Arrays.toString(copia));


    }
}
