import java.util.Scanner;
public class UsosDelFor {
    public static void main(String[] args) {
        /*for(int i=0;i<10;i++){
            System.out.println("Isabella G");
        }

        for(int i=5;i>0;i--){
            System.out.println("Isis G");
        }*/
        //Programa que evalue si una dirección de email es correcta
        Scanner entrada=new Scanner(System.in);
        int at=0;
        boolean dot=false;
        System.out.println("Introduce tu e-mail:  ");
        String mail=entrada.nextLine();
        for(int i =0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                at++;
            }
            if(mail.charAt(i)=='.'){
                dot=true;
            }
        }
        if(at==1 && dot == true){
            System.out.println("El correo es válido.");
        }
        else{
            System.out.println("Correo inválido,  por favor intentar otra vez.");
        }
        entrada.close();
    }

}
