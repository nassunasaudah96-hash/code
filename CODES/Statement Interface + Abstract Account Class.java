// Statement.java
public interface Statement {
    String generateStatement();
}

// Account.java
public abstract class Account implements Statement {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    public String generateStatement() {
        return "Account: " + accountNumber + "\nBalance: UGX " + balance;
    }
}