import java.util.Scanner;

public class Lector {

    public static Scanner src = new Scanner(System.in);
    static boolean leido = false;

    public static String pideUnCadena(String txt) throws Exception{

        System.out.println(txt);
        do {
            try {
                leido = true;
                return src.nextLine();
            } catch (Exception e) {
                throw e = new Exception("Error, introduzca una cadena de texto");
            }
        } while (leido != true);

    }

    public static int pideUnEntero(String txt) throws Exception{

        System.out.println(txt);
        do {
            try {
                leido = true;
                return src.nextInt();
            } catch (Exception e) {
                throw e =  new Exception("Error, introduzca un entero");
            }
        } while (leido != true);
    }

    public static double pideUnDecimal(String txt) throws Exception{

        System.out.println(txt);
        do {
            try {
                leido = true;
                return src.nextDouble();
            } catch (Exception e) {
                throw e =  new Exception("Error, introduzca un decimal");
            }
        } while (leido != true);
    }

}
