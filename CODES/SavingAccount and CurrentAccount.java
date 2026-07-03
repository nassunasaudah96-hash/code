// SavingsAccount.java
public class SavingsAccount extends Account {
    private double rate;  // interest rate

    public SavingsAccount(String accountNumber, double balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false; // refuse withdrawal
    }

    public void addInterest() {
        balance += balance * (rate / 100);
    }
}

// CurrentAccount.java
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}