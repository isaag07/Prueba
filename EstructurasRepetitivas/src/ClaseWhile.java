import java.util.Scanner;
public class ClaseWhile {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("--Bienvenido--");
        String clave="IsabellaG";
        String pass="";
        while(clave.equals(pass)==false){

            System.out.println("Por favor ingrese la contraseña: ");
            String pss=lector.nextLine();

            pass = pss;

        }
        lector.close();

    }
}
