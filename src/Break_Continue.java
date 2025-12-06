public class Break_Continue {
    public static void main(String[] args) {

        int control = 0, f = 0;

        System.out.println("Cargando registros...");
        while(f <= 10) {

            f++;
            if (f == 7){
                System.out.println("Error de carga");
                break;

            }
        }

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Valor: " + i);
        }
    }
}
