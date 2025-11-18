import java.util.Scanner;

public class Metodo_NextLine {
    public static void main(String[] args) {

        String texto1, texto2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese texto1...");
        texto1 = entrada.next();

        System.out.println("Ingrese texto2...");
        texto2 = entrada.nextLine();
    }
}
