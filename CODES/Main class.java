public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("C001", "John Doe");
        SavingsAccount sav = new SavingsAccount("SAV001", 500000, 5.0);
        CurrentAccount cur = new CurrentAccount("CUR001", 200000, 100000);

        cust.addAccount(sav);
        cust.addAccount(cur);

        System.out.println(sav.generateStatement());
        System.out.println("Total Worth: " + cust.totalWorth());
        sav.addInterest();
        System.out.println("After interest: " + sav.getBalance());
    }
}