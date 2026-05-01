package classwork17;

public class BankAccount {
    double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("vse popolnil " + balance);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("malo deneg");
        } else {
            balance -= amount;
            System.out.println("snal " + balance);
        }
    }
    public double getBalance(){ 
        return balance; 
    }
}