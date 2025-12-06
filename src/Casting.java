public class Casting {
    public static void main(String[] args){

        //De texto a antero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);

        System.out.println("Numero entero: " + numeroEntero);

        //Entero a texto
        int numeroEntero2 = 456;
        String numeroTexto2 = String.valueOf(numeroEntero2);
        System.out.println("Texto: " + numeroTexto2);

        //double a int
        double numeroDoble = 45.50;
        int dobleEntero = (int) numeroDoble;
        System.out.println("De doble a entero: " + dobleEntero);

        //De entero a doble
        int entero2 = 789;
        double enteroDoble = (double) entero2;
        System.out.println("De entero a double: " + enteroDoble);
     }
}