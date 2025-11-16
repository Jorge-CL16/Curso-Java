public class Oper_Comparacion {

    public static void main(String[] args){
        int valor1 = 90, valor2 = 50;


        //igualdad
        var resultado = valor1 == valor2;
        System.out.println(valor1+" es igual a: " + valor2 + "? " + resultado);

        //distinto a
        resultado = valor1 != valor2;
        System.out.println(valor1+" es distinto a: " + valor2 + "? " + resultado);

        //mayor que..
        resultado = valor1 > valor2;
        System.out.println(valor1+" es mayor que: " + valor2 + "? " + resultado);

        //menor que
        resultado = valor1 < valor2;
        System.out.println(valor1+" es menor que: " + valor2 + "? " + resultado);


        //mayor o igual que
        resultado = valor1 >= valor2;
        System.out.println(valor1+" es mayor que: " + valor2 + "? " + resultado);


        //manor o igual que
        resultado = valor1 <= valor2;
        System.out.println(valor1+" es menor o igual que: " + valor2 + "? " + resultado);
    }
}
