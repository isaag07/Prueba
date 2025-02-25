import java.util.Scanner;
/**
 * Tarea Repaso
 * Calcular el factorial de un numero
 * @author Isabella Gonzalez
 * @version 1.0
 * 
 */
public class EjercicioFactorial {
    /**
     * factorial
     * Esta subrutina calcula el numero factorial de un numero
	 * ejemplo Ocho factorial es igual a 8*7*6*5*4*3*2*1 = 40320.
     * @param val ingresa el valor inicial valIni>0 y valIni<=12
     * @return resultado int con calculo del numero factorial
     * 
     */
    public static int factorial(int val){
        int resultado=1;
        for(int i =1; i <= val; i++){
         resultado *=i;
        }
        
       return resultado;
   }
/**
 * main
 * Esta es la subrutina ejecutable de java
 * @param args  
 */
   public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero del cual quiere sacar el factorial: ");

        int fact=entrada.nextInt();

        int facTorial= factorial(fact);

        System.out.println("El factorial del numero "+fact+" es: "+facTorial);


        entrada.close();
   }

}
