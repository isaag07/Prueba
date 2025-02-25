import java.util.Scanner;
public class UsosArraysII {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        /*System.out.println("Cuantos niños hay en el salon? ");
        int room=entrada.nextInt();

        int []edades=new int[room];

        for(int i=0;i<edades.length;i++){
            System.out.println("Por favor ingrese la edad del estudiante "+(i+1)+" :");
            edades[i]=entrada.nextInt();
        }

        for(int i=0;i<edades.length;i++){
            System.out.println("La edad del estudiante "+(i+1)+ "  es: "+edades[i]);
        }
        */
        /*System.out.println("Cuantos paises desea agregar a la lista? ");
        int numPaises=entrada.nextInt();
        entrada.nextLine(); //Esta línea es para limpiar el bufer y que no me pregunte dos veces la siguiente línea


        String []paises=new String[numPaises ];

        for(int i=0;i<paises.length;i++){
            System.out.println("Ingrese país "+(i+1)+": ");
            paises[i]=entrada.nextLine();
        }

        for(String elemento:paises){
            System.out.println("Pais: "+ elemento);
        }   */


        int []matrizAleat=new int[150];

        for(int i=0;i<matrizAleat.length;i++){
             matrizAleat[i]=(int)Math.round(Math.random()*100); 
        }

        for (int num:matrizAleat){
            System.out.print(num+" ");
        }
        
        entrada.close();

    }
}
