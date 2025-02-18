import java.util.Scanner;
public class Supermercado {

    public static void main(String[] args) {
        System.out.println("----Bienvenido al Supermercado----");

        //Solicitar la cantidad de items a comprar
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de items que desea comprar: ");
        int totalItems = lector.nextInt();

        // validar la cantidad de items 
        if (totalItems<=0){
            System.out.println("Error, cantidad de items invalido.");
            System.out.println("La cantidad debe ser mayor a 0");
        }
        double totalPrice=0.0;
        double price=0;


        for (int i=1; i<=totalItems; i++){
            System.out.println("Producto "+(i)+":");
            System.out.println("Por favor ingrese el precio del producto: ");
            double precio=lector.nextDouble();
            System.out.println("Ingrese la cantidad que va a llevar de este producto: ");
            int cant=lector.nextInt();
            price= cant*precio;

            totalPrice+=price;
        }
        System.out.printf("El precio total a pagar es: %.2f%n", totalPrice);
        lector.close();
        
    }
    
}
