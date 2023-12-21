package utiles;
import java.util.Scanner;

public class Utilidades {
    //    public static void print (Object texto) {
//        System.out.println(texto);
//    }
    public static void print(Object texto, Object... variables) {
        if (variables != null && variables.length > 0) {
            System.out.printf((texto.toString()) + "%n", variables);
        } else {
            System.out.println(texto);
        }
    }

    public static Object input(String datos_user) {
        System.out.print(datos_user);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double inputfloat(String datos_user) {
        System.out.print(datos_user);
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }
}