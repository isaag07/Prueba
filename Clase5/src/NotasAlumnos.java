import java.util.Scanner;
/**
 * Clase NotasAlumnos
 * Ingresa las notas del estudiante y se calcula el promedio
 * @author Isabella Gonzalez
 * @version 1.0
 */
public class NotasAlumnos {
    
    /**
     * calcularPromedio
     * Calcula las notas del promedio ingresado
     * @param n[] es un arreglo de notas n!=num
     * @return double con el promedio de las notas
     */
    public static double calcularPromedio(double[] n){
        double resultado=0;

        for (int i=0; i<n.length;i++){
            resultado+= n[i];
        }

        resultado=resultado/5.0;

        return resultado;
    }

    /**
     * main
     * metodo ejecutable de java
     * @param args[] es unarreglo de String
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantidad=10;
        double []notas=new double[cantidad];
        System.out.println("Ingrese las notas de Juan: ");

        for(int i=0; i<notas.length;i++){
            System.out.println("Ingrese la nota #"+(i+1));
            notas[i]=entrada.nextDouble();
        }


        double promedio= calcularPromedio(notas);

        System.out.printf("El promedio obtenido por Juan es: %.2f",promedio);


        entrada.close();
    }
}
