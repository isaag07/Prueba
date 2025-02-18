import java.util.Scanner;

public class CondicionalStatements {
    public static int squared(int x, int y){
        int totalS = 0;
        totalS=(x*x)+(y*y);
        return totalS;
    }
    public static double average(double n1, double n2, double n3, double n4, double n5){
        double totalA = 0;
        totalA=(n1+n2+n3+n4+n5)/5.0;
        return totalA;
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner reader=new Scanner (System.in);
        /*int purchase=0;
        System.out.println("Purchase value: ");
        purchase=reader.nextInt();
        double discount = 0;
        if(purchase>100000){
            discount = purchase*0.25;
        } 
        double total= purchase - discount;
        System.out.println("You have to pay $" + total );*/
        System.out.println("Type the motorcycle brand you would like to buy: ");
        String brand= reader.nextLine().toUpperCase();
        double discount= 0;
        System.out.println("Type the inicial amount of $ you have to pay for the motorcycle: ");
        int motorcyclev = reader.nextInt();
        System.out.println(brand);
        if(brand.equals("HONDA"))
        {
            discount= motorcyclev * 0.05;
        }
        else if(brand.equals("YAMAHA"))
        {
            discount = motorcyclev * 0.08;
        }
        else if (brand.equals("SUZUKI")) {
            discount = motorcyclev * 0.1;
        } else {
            discount= motorcyclev * 0.02;
        }
        double total=motorcyclev-discount;
        System.out.println("The final amount you will have to pay after the discount is $"+total+",");
        System.out.print(" the discount applied was "+ discount);
        
        
        reader.close();

    }

}
