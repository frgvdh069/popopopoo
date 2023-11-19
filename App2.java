import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SerieNumerica8 oSerieNumerica8 = new SerieNumerica8();

        int NumTerminos;

        System.out.println("Ingrese el numero de terminos de la serie:");
        NumTerminos = Integer.parseInt(sc.nextLine());
        System.out.println("....................................");

        System.out.println("Serie 8: 3,8,13,18,23,28,...");
        System.out.println("Método for:");
        oSerieNumerica8.showserie8For(NumTerminos);
        System.out.println(".....................................");
        System.out.println("Método while:");
        oSerieNumerica8.showserie8while(NumTerminos);
        System.out.println(".....................................");
        System.out.println("Método Do-while:");
        oSerieNumerica8.showserie8dowhile(NumTerminos);
        System.out.println(".....................................");
    }
}
