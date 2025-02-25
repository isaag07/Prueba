import java.util.Scanner;
public class AgenciaDeViaje {

    /**
     * hospedaje
     * Esta subrutina calcula el precio del hospedaje
     * @param n esta esta la cantidad de noches que se hospeda el cliente
     * @param costo este es el costo establecido por noche
     * @return devuelve el costo del hospedaje antes de calcular el descuento
     */
    public static double hospedaje(int n,int costo){
        double costoHospedaje=n*costo;
        
        return costoHospedaje;
    }
    /**
     * descuentoDiezPorciento
     * Esta subrutina calcula si el huesped aplica para el 10% de descuento en su hospedaje
     * @param ni esta es la cantidad de noches que se va a hospedar
     * @param h este es el costo total del hospedaje
     * @return devuelve el costo final despues de aplicar el descuento
     */
    public static double descuentoDiezPorciento(int ni,double h){
        double costoHospedajee=0;
        if (ni>=3){
            double descuento= h * 0.10;
            costoHospedajee-=descuento;

        }

        return costoHospedajee;

    }

    /**
     * transporteUno
     * Esta subrutina identifica que tipo de transporte va a usar el huesped de ida para saber cuanto cobrar
     * @param m esta es la eleccion de transporte del cliente
     * @param cb esto es lo que se le cobre si va en bus
     * @param ca esto es lo que se le cobra si va en avion
     * @return me devuelve el total a pagar por el transporte de ida
     */
    public static int transporteUno (int m, int cb, int ca){
        int costoTransporte=0;
        if (m==1){
            costoTransporte+=cb;
        }
        else if (m==2){
            costoTransporte+=ca;
        }
        return costoTransporte;
    }

    /**
     * transporteDos
     * Esta subrutina identifica que tipo de transporte va a usar el huesped de vuelta para saber cuanto cobrar
     * @param m esta es la eleccion de transporte del cliente
     * @param cb esto es lo que se le cobre si va en bus
     * @param ca esto es lo que se le cobra si va en avion
     * @return me devuelve el total a pagar por el transporte de vuelta
     */
    public static int transporteDos(int m,int cb, int ca){
        int costoTransporte=0;
        if(m==1){
            costoTransporte+=cb;
        }
        else if(m==2){
            costoTransporte+=ca;
        }
        return costoTransporte;
    }

    /**
     * main
    * Esta es la subrutina ejecutable de java
     * @param args arreglo de String args!=null 
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int costoNoche=150000;
        int costoBus=80000;
        int costoAvion=250000;
        double costoTotal=0;
        double costoTransporte=0;

        System.out.println("Ingrese el numero de noches que desea hospedarse: (Minimo 1 y maximo 4)");
        int noches=entrada.nextInt();

        if (noches<1 || noches>4){
            System.out.println("Error, el numero ingresado no esta dentro de los parametros, recuerde minimo 1 noche maximo 3 noches.");
        }

        double costoHospedaje= hospedaje(noches, costoNoche);

        System.out.println("El costo de su hospedaje fue: "+costoHospedaje);
        
        double descuento = descuentoDiezPorciento( noches, costoHospedaje);
        if(descuento!=0.0){
            System.out.println("Pero gracias a que se quedo 3 noches o mas tiene un descuento del 10%:" +descuento);
        }
        

        System.out.println("Seleccione el transporte de ida (1. Bus - $80.000 | 2. Avión - $250.000): ");
        int transporteIda = entrada.nextInt();

        int transI=transporteUno(transporteIda,costoBus,costoAvion);

        System.out.println("El costo total de su transporte de ida es: "+transI);

        System.out.println("Seleccione el transporte de VUELTA (1. Bus - $80.000 | 2. Avión - $250.000): ");
        int transporteVuelta = entrada.nextInt();

        int transV=transporteDos(transporteVuelta,costoBus,costoAvion);

        System.out.println("El costo total de su transporte de vuelta es: "+transV);
        
        costoTransporte=transI+transV;

        costoTotal=costoHospedaje+costoTransporte-descuento;


        System.out.println("--FACTURA--");
        System.out.println("Noches de hospedaje: " + noches);
        System.out.println("Costo hospedaje: $" + costoHospedaje);
        System.out.println("Transporte de ida: "+transI);
        System.out.println("Transporte de vuelta: "+transV);
        System.out.println("Total a pagar: $" + costoTotal);

        entrada.close();
    }
}
