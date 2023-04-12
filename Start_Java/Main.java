import java.util.*;

class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
        } else {
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
        } else {
            account.withdraw(amount);
        }
    }

    private Account getAccount(String accountNumber) {
        for (Account account : this.accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");
        bank.addAccount(new Account("123456"));
        bank.addAccount(new Account("654321"));

        bank.deposit("123456", 100.0);
        bank.withdraw("123456", 50.0);
        bank.withdraw("123456", 60.0);
        bank.deposit("654321", 200.0);
        bank.withdraw("654321", 100.0);
    }
}
