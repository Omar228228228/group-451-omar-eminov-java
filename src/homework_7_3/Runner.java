package homework_7_3;

public class Runner {
    public static void main(String[] args) {
        bankaccount acc1 = new bankaccount("Alex", 1000);
        bankaccount acc2 = new bankaccount("Shahbaz", 50000);
        acc1.showBalance();
        acc2.showBalance();
        acc1.deposit(300);
        acc1.withdraw(200);
        acc1.transfer(acc2, 500);
        acc1.showBalance();
        acc2.showBalance();
}
}