public static int contarMultiplosVeinteWhile(int valIni, int valFin){
    int conteo=0;
    int x=valIni;
    while(x<= valFin){
        if (x%20==0){
            conteo++;
        }
        x++;
    }


    return conteo;
}


public static int contarMultiplosVeinteFor(int valIni, int valFin){
    int conteo=0;
    for(int x=valIni; x <=valFin ; x++){
        if (x%20==0){
            conteo++;
        }
    }

    return conteo;
}

public static boolean hayMultiplosSiete(int valIni, int valFin){
    boolean existe = false;
    for(int x=valIni; x<=valFin && !existe ; x++){
        if (x %7==0){
            existe = true;
        }
    }
    return existe;
}

public static void main (String[]args) {
    int resultado = contarMultiplosVeinteWhile(0, 10000);
    System.out.println(resultado);

    int resultadoFor = contarMultiplosVeinteFor(0, 10000);
    System.out.println(resultadoFor);

    boolean siete= hayMultiplosSiete(15, 25);
    if(siete)
        System.out.println(siete);
    else
    System.out.println("no existen multiplos");

}