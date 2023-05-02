import java.util.Scanner;

public class Lector {
    
    public static Scanner src = new Scanner(System.in);

    public static String PideUnCadena(String txt) {
        System.out.println(txt);
        return src.nextLine();
    }

    public static int PideUnEntero(String txt) {
        System.out.println(txt);
        return src.nextInt();
    }

    public static double PideUnDecimal(String txt) {
        System.out.println(txt);
        return src.nextDouble();
    }

}
