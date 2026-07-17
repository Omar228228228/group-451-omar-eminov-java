package homework_7_3;

public class bankaccount {

    String owner;
    double balance;

    public bankaccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
            balance += amount;
        
    }

    public void withdraw(double amount) {
        
            balance -= amount;
        
    }

    public void showBalance() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    public void transfer(bankaccount targetAccount, double money) {
        balance -= money;
        targetAccount.balance += money;
}
}