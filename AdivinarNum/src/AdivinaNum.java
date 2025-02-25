import java.util.*;
public class AdivinaNum {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);
        Scanner lector=new Scanner(System.in);

        int intentos=0;
        int num=0;
            while(num!=aleatorio){
                intentos++;
                System.out.println("Por favor ingrese un numero entre 0 y 100: ");
                num=lector.nextInt();
                if(num<0 || num>100){
                    System.out.println("El numero ingresado es incorrecto, tiene que estar entre 0 y 100.");
                }
                else if(aleatorio<num){
                    System.out.println("Ingrese un numero menor.");
                }
                else if(aleatorio>num){
                    System.out.println("Ingrese un numero mayor.");
                }
                else{
                    System.out.println("Correcto! Adivinaste el numero en "+intentos+" intentos!");
                }
                if(intentos>9){
                    System.out.println("Se acabaron los intentos :(");
                    break;
                }
                System.out.println("Llevas "+intentos+" intentos, solo son 10.");
            }
        lector.close();
    }
}
