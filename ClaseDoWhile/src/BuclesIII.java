import java.util.*;

public class BuclesIII {
    public static void main(String[] args) {
    
        Scanner entrada=new Scanner(System.in);
        String gend="";
        int altura=0;
        int pesoIdeal=0;

        do{
            System.out.println("Cual es su género? (H/M): ");
            gend=entrada.nextLine().toUpperCase();

        }while (gend.equals("H")==false && gend.equals("M")==false) ;

        System.out.println("Introduce tu altura en cm: ");
        altura=entrada.nextInt();

        if (gend.equals("H")){
            pesoIdeal=altura-110;
        }
        else{
            pesoIdeal=altura-120;
        }
        System.out.println("Tu peso ideal es: "+pesoIdeal+"kg");

        entrada.close();
    }
}
