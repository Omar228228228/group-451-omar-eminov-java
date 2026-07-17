package homework_4;

public class BankAccount {
    private String owner;
    private double balance;
    BankAccount(String owner, double balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

    }
    void deposit(double money) {
        if (money > 0) {
            balance = balance + money;
        }

    }
    void withdraw(double money) {

        if (money <= balance) {
            balance = balance - money;
        } else {
            System.out.println("Not enough money");
        }

    }
    double getBalance() {
        return balance;
    }
    void printStatement() {

        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);

    }
}