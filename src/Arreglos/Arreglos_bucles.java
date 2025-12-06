package Arreglos;

public class Arreglos_bucles   {
    public static void main(String[] args){
        String[] productos = {"","Martirllo",
                "Destornillador",
                "Taladro",
                "LLave inglesa",
                "Pinzas"  };

        for(int i = 1; i < productos.length; i++){
            System.out.println("Producto: " + i + "."+ productos[i]);
        }

        for (String herraminetas : productos){
            System.out.println(herraminetas);
        }
    }
}
