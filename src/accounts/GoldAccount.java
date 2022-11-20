package accounts;

import core.Account;

public class GoldAccount extends Account {
    private final double overdraftLimit;
    public GoldAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public int withdraw(double amountOut) {
        if(amountOut > balance + overdraftLimit) {
            return 10;
        } else {
            balance = balance - amountOut;
            return -10;
        }
    }
}
