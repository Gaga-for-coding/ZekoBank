package util;
import java.util.Scanner;

public class EasyScanner {
    public static int nextInt()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

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
