package core;
import java.util.ArrayList;

public class Bank {
    ArrayList<Account> list = new ArrayList<>();

    private int search(String accountNumber){
        for (int i = 0; i <= list.size() - 1; i++){
            Account entity = list.get(i);
            String tempAccountNumber = entity.getAccountNumber();

            if(tempAccountNumber.equals(accountNumber)){
                return i;
            }
        }
        return -99;
    }

    public int getTotalCustomers(){
        return list.size();
    }

    public Account getAccount(String accountNumber){
        int index = search(accountNumber);
        if(index != -99){
            return list.get(index);
        }else {
            return null;
        }
    }

    public boolean addAccount(String accountNumber, String accountName, double balance){
        if(search(accountNumber) == -99){
            list.add(new Account(accountNumber, accountName, balance));
            return true;
        }
        return false;
    }


    public boolean deposit(String accountNumber, double balance){
        Account account = getAccount(accountNumber);

        if(account != null){
            account.deposit(balance);
            return true;
        }
        return false;
    }

    public boolean withdraw(String accountNumber, double amountOut){
        Account account = getAccount(accountNumber);

        if (account != null && account.getBalance() >= amountOut){
            return account.withdraw(amountOut) == -10;
        }else {
            return false;
        }

    }

    public boolean removeAccount(String accountNumber){
        int index = search(accountNumber);
        if(index == -99){
            return false;
        }
        list.remove(index);
        return true;
    }


}
