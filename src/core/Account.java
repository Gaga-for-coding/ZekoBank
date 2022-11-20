package core;

public class Account {
    private final String accountNumber;
    private final String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amountIn)
    {
        this.balance = this.balance + amountIn;
    }

    public int withdraw(double amountIn)
    {
        if(amountIn > this.balance)
        {
            return 10; // no withdrawal was made
        }
        else
        {
            this.balance = this.balance - amountIn;
            return -10; // money was withdrawn successfully
        }
    }
}
