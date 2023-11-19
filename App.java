import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();

        int numTerminos;
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Grupo: ....");
        System.out.println("Integrantes: Julian Camacho, Juan Chanatasig, Andrea Chicaiza, Antony Cobos, Paul Davila, Edison Dueñas, Isabella Hernandez" );
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("Ingrese el número de veces que desea repetir las series");
        numTerminos = Integer.parseInt(sc.nextLine());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Serie 10: 3, 9, 27, 81, 243, 729, 2187, ...");
        System.out.println("Usando for:");
        oSerieNumerica10.showSerie10For(numTerminos);
        System.out.println("Usando While:");
        oSerieNumerica10.showSerie10While(numTerminos);
        System.out.println("Usando doWhile:");
        oSerieNumerica10.showSerie10doWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerieNumerica10.showSerie10Recursividad(numTerminos,3);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

    }
}