import java.util.Scanner;
public class isabellaGonzalez {
    public static int calcularPesoIdeal(double estatura){
        int pesoId=0;
        pesoId= (int)(estatura*100-100.0);
        return pesoId;
    }
    public static int calcularSobrepeso(double estatura, double pesoActual){
        int sobrepeso=0;
        sobrepeso=(int)(pesoActual-(estatura*100-100));
        return sobrepeso;
    }
    public static int calcularCaloriasQuemar(double sobrePeso){
        int calorPorKilg=7700;
        int cals=0;
        cals= (int)(sobrePeso * calorPorKilg);
        return cals;
    }
    public static void main(String[] args) {
        System.out.println("Gimnasio Adelgacemos");
        Scanner reader= new Scanner(System.in);
        System.out.println("Peso actual: ");
        int pesoAct=reader.nextInt();
        System.out.println("Estatura: ");
        double estaturaAct=reader.nextDouble();
        System.out.println("Numero sesiones a la semana: ");
        int sesiones=reader.nextInt();
        

        //70System.out.println(pesoAct);

        double pesoIdeal=calcularPesoIdeal(estaturaAct);
        System.out.println("Su peso ideal es: "+pesoIdeal);

        double sobre= calcularSobrepeso(estaturaAct,pesoAct);
        System.out.println(sobre);
        if (sobre == 0 || sobre<0){
            System.out.println("Felicitaciones, ud no tiene sobre peso.");
        } else {
            System.out.println("Su sobre peso es de: "+ sobre);
        }

        double cals = calcularCaloriasQuemar(sobre);

        int caloriasPorSemana= 450*sesiones;
        double semanasNecesarias= sobre/caloriasPorSemana;
        System.out.println("Vas a necesitar "+semanasNecesarias+" para llegar a tu peso ideal.");





        reader.close();
    }
}
