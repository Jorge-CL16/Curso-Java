public class Concatenacion {

    public static void main(String[] args) {
        String nombre = "Jorge";
        String apellido = "Díaz";
        int valor = 7;
        String palabra1 = "Aprendiendo", palabra2="Java";
        String saludo = palabra1 + " " + palabra2;

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        System.out.println("Valor: " + valor);
        System.out.println(saludo);
        System.out.println(palabra1.concat(" " + palabra2));
    }
}