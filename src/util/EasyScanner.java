package util;
import java.util.Scanner;

public class EasyScanner {

    public static double nextDouble()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }

    public static String nextString()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    public static char nextChar()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next().charAt(0);
    }

}
