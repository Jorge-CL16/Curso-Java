public class Condicional_if_or {
    public static void main(String[] args){
        boolean domingo = true;
        boolean vacaciones = false;

        //Ingresando datos
        if (domingo == true || vacaciones == true){
            System.out.println("Acceso denegado a la empresa");
        } else {
            System.out.println("Accesso concedido");
        }
    }
}
