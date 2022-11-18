package util;

import core.Account;
import core.Bank;

public class Gui {
    public static void button1(Bank bank){
        System.out.println("Welcome To Zeko Bank");
        System.out.println("Please enter your account number it should be 6 characters long: ");
        String accountNumber = EasyScanner.nextString();
        System.out.println("Please enter your account name: ");
        String accountName = EasyScanner.nextString();
        System.out.println("Please enter an initial balance: ");
        double balance = EasyScanner.nextDouble();
        boolean success = bank.addAccount(accountNumber, accountName, balance);
        if(success){
            System.out.println("Account successfully added !");
            System.out.println("Welcome To the Zeko Family");
            System.out.println("Total Customers now " + bank.getTotalCustomers());
        } else {
            System.out.println("Account number already exist");
        }
    }

    public static void button2(Bank bank){
        System.out.println("Enter account number : ");
        String accountNumber = EasyScanner.nextString();
        boolean found = bank.removeAccount(accountNumber);

        if (found){
            System.out.println("Account deleted successfully");
        } else {
            System.out.println("Account not found");
        }
    }

    public static void button3(Bank bank){
        System.out.println("Please enter your account number");
        String accountNumber = EasyScanner.nextString();
        System.out.println("Please enter amount to deposit : ");
        double amount = EasyScanner.nextDouble();
        boolean success = bank.deposit(accountNumber, amount);

        if(success){
            System.out.println("Money deposited successfully");
        }else {
            System.out.println("Account not found");
        }
    }

    public static void button4(Bank bank){
        System.out.println("Please enter your account number");
        String accountNumber = EasyScanner.nextString();
        System.out.println("Please enter an amount to withdraw");
        double amountOut = EasyScanner.nextDouble();

        boolean success = bank.withdraw(accountNumber, amountOut);
        if(success){
            System.out.println("Withdrawal completed with success");
        } else {
            System.out.println("Error could not complete withdrawal no such account or insufficient fund ");
        }
    }

    public static void button5(Bank bank){
        System.out.println("Please enter account number : ");
        String accountNumber = EasyScanner.nextString();
        Account account = bank.getAccount(accountNumber);

        if(account != null){
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account name: " +account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        } else {
            System.out.println("No such account");
        }
    }




}
