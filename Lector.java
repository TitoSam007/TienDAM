import java.util.Scanner;

public class Lector {
    
    public static Scanner src = new Scanner(System.in);

    public static String pideUnCadena(String txt) {
        System.out.println(txt);
        return src.nextLine();
    }

    public static int pideUnEntero(String txt) {
        System.out.println(txt);
        return src.nextInt();
    }

    public static double pideUnDecimal(String txt) {
        System.out.println(txt);
        return src.nextDouble();
    }

}
