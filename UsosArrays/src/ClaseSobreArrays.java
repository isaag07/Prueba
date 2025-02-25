public class ClaseSobreArrays {
    public static void main(String[] args) {
        /*int[] edades=new int[5];
        edades[0]=14;
        edades[1]=25;
        edades[2]=13;
        edades[3]=9;
        edades[4]=12;*/ 

        int [] edades={35,42,23,20,37,24,53,65,43,23,12,44,55,23,22,24};
        
        for(int i =0; i<edades.length;i++){ 
            System.out.println("el valor de la posición "+(i+1)+" es: "+ edades[i]);
        }
        
    }

}
