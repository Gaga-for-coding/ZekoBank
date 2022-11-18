import core.Bank;
import util.EasyScanner;
import util.Gui;

public class Main {
    public static void main(String[] args) {
        char choice;
        Bank zeko = new Bank();

        do {
            System.out.println();
            System.out.println("1. Create new account");
            System.out.println("2. Remove an account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Check account details");
            System.out.println("6. Quit");
            System.out.println("Bye bye thanks for using Zeko");
            System.out.println();
            System.out.print("Enter choice [1-6]: ");
            choice = EasyScanner.nextChar();
            System.out.println();

            switch (choice){
                case '1': Gui.button1(zeko);
                    break;
                case '2': Gui.button2(zeko);
                    break;
                case '3': Gui.button3(zeko);
                    break;
                case '4': Gui.button4(zeko);
                    break;
                case '5': Gui.button5(zeko);
                    break;
                case '6':
                    System.out.println("Good Bye!!!!");
                    break;
                case '7': break;
                default:
                    System.out.println("Invalid entry, try again : ");
            }
        }while (choice != '6');
    }
}