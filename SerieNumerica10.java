/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 3.0
 */

public class SerieNumerica10 {
    /**
     * <b>showSerie10For</b> muestra la serie: 3, 9, 27, 81, 243, 729, 2187, ... usando for.
     * @param numTerminos : Número de terminos de la serie
     */
    public void showSerie10For (int numTerminos){
        int terminoMostrar  = 3;
        for(int i = 0; i < numTerminos; i++){
            System.out.print( (i<numTerminos-1) ? terminoMostrar + ", " : terminoMostrar);
            terminoMostrar = terminoMostrar * 3;

            //Usando if:
           /*  if (i<numTerminos-1) {
                System.out.print( terminoMostrar + ", " );
            } else {
                System.out.println( terminoMostrar);
            } 
            terminoMostrar = terminoMostrar * 3;
            */
        }
        System.out.println("");

    }

    /**
     * <b>showSerie10While</b> muestra la serie: 3, 9, 27, 81, 243, 729, 2187, ... usando while.
     * @param numTerminos : Número de terminos de la serie
     */
    public void showSerie10While (int numTerminos){
        int terminoMostrar  = 3;
        while (numTerminos > 0) {
            System.out.print( (numTerminos!=1) ? terminoMostrar + ", " : terminoMostrar);
            terminoMostrar = terminoMostrar * 3;
            numTerminos--;
        }
        System.out.println("");
    }

    /**
     * <b>showSerie10doWhile</b> muestra la serie: 3, 9, 27, 81, 243, 729, 2187, ... usando do while.
     * @param numTerminos : Número de terminos de la serie
     */
    public void showSerie10doWhile (int numTerminos){
        int terminoMostrar  = 3;
        do {
            System.out.print( (numTerminos!=1) ? terminoMostrar + ", " : terminoMostrar);
            terminoMostrar = terminoMostrar * 3;
            numTerminos--;
        } while (numTerminos != 0);
        System.out.println("");
    }

     /**
     * <b>showSerie10Recursividad</b> muestra la serie: 3, 9, 27, 81, 243, 729, 2187, ... usando do while.
     * @param numTerminos : Número de terminos de la serie
     * @param terminoMostrar : termino a mostrar
     */
    public void showSerie10Recursividad (int numTerminos, int terminoMostrar){
       if (numTerminos == 1) {
        System.out.println(terminoMostrar);
       } else {
        System.out.print(terminoMostrar + ", ");
        showSerie10Recursividad(numTerminos-1, terminoMostrar*3);
       }
    }
}