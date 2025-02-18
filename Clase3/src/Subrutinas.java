import java.util.Scanner;
public class Subrutinas {}
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
    public static int large(int n1, int n2, int n3, int n4, int n5){
        int largeNum=0;
        if(n1>largeNum){
            largeNum=n1;
        }
        if(n2>largeNum){
            largeNum=n2;
        }
        if(n3>largeNum){
            largeNum=n3;
        }
        if(n4>largeNum){
            largeNum=n4;
        }
        if(n5>largeNum){
            largeNum=n5;
        }
        return largeNum;
    }

    public static void procDivisible(int n1, int n2, int n3, int n4, int n5){

        //ArrayList<Integer> nums = new ArrayList<>();
        int contador=0;
        if (n1%10 == 0){
            contador++;
            //nums.add(n1);
        }
        if (n2%10 == 0){
            contador++;
            //nums.add(n2);
        }
        if (n3%10 == 0){
            contador++;
            //nums.add(n3);
        }
        if (n4%10 == 0){
            contador++;
            //nums.add(n4);
        }
        if (n5%10 == 0){
            contador++;
            //nums.add(n5);
        }
        //System.out.println("In this specific list of numbers there are "+ nums.size()+" numbers that are divisible by 10.");
        System.out.println("In this specific list of numbers there are "+ contador+" numbers that are divisible by 10.");
    }
    /*public static void procDivBy5(int n1, int n2, int n3, int n4, int n5){
        ArrayList<Integer> nums = new ArrayList<>();
        if (n1%5 == 0){
            nums.add(n1);
            //System.out.println("The first number is divisible by 5.");
        }
        if (n2%5 == 0){
            nums.add(n2);
            //System.out.println("The second number is divisible by 5.");
        }
        if (n3%5 == 0){
            nums.add(n3);
            //System.out.println("The third number is divisible by 5.");
        }
        if (n4%5 == 0){
            nums.add(n4);
            //System.out.println("The fourth number is divisible by 5.");
        }
        if (n5%5 == 0){
            nums.add(n5);
            //System.out.println("The fifth number is divisible by 5.");
        }
        if (nums.isEmpty()){
            System.out.println("In this list there aren't numbers divisible by 5.");
        } else {
            System.out.println("In this list there are numbers divisible by 5.");
        }
 }*/
    public static void divisibleby5(int n1,int n2, int n3, int n4, int n5){
        String message ="No existen numeros divisibles por 5.";
        if(n1%5 == 0 || n2 % 5==0 || n3%5==0 || n4%5==0 || n5%5==0){
            message="Si existen numeros divisibles por 5.";
        }
        System.out.println(message);
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner reader=new Scanner (System.in);
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        System.out.println("First value: ");
        num1=reader.nextInt();
        System.out.println("Second value: ");
        num2=reader.nextInt();
        System.out.println("Third value: ");
        num3=reader.nextInt();
        System.out.println("Fourth value: ");
        num4=reader.nextInt();
        System.out.println("Fifth value: ");
        num5=reader.nextInt();

        double prom= average(num1,num2,num3,num4,num5);
        System.out.println("The average of those values is: "+ prom);

        procDivisible(num1, num2, num3, num4, num5);
        
        divisibleby5(num1, num2, num3, num4, num5);


        int mayor=large(num1,num2,num3,num4,num5);
        System.out.println("The largest number is: "+ mayor);
        /*int result= squared(num1,num2);
        System.out.println("La suma de los cuadrados es: "+result);
        */

        reader.close();
}

