import java.util.Scanner;
public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("*** Welcome Professor ***");
        Scanner lector = new Scanner(System.in);
        /*System.out.print("Type down the amount seconds you want to convert: ");
        int seconds = lector.nextInt();

        int minresult = seconds/60;
        int secondsresult = seconds%60;

        System.out.println("There are "+ minresult+ " minutes and "+ secondsresult + " seconds in "+ seconds +" seconds.");

        System.out.print("Type the salary you want to calculate: ");
        int salary = lector.nextInt();
        System.out.print("Type the percentage you'd like to increase it by: ");
        double per= lector.nextDouble();
        double percentage= per/100;
        double salaryper = salary * percentage;
        double salaryresult = salary + salaryper;
        System.out.println("Your salary increased by "+ per+"% would be: " + salaryresult);*/

        System.out.print("Please type down the total amount of students in the room: ");
        int totalClass= lector.nextInt();
        System.out.print("Type down the amount of boys in the classroom: ");
        double boyA= lector.nextInt();
        double girlsA= totalClass - boyA;


        double perBoys= (boyA/totalClass)*100;
        double perGirls= (girlsA/totalClass)*100;

        System.out.println("For this case the percentage amount of boys is "+String.format("%.3f", perBoys)+"% and the percentage amount of girls is "+String.format("%.3f", perGirls)+"%");
        System.out.printf("For this case the percentage amount of boys is: "+"%.2f",perBoys);
        
        lector.close();
	}
}