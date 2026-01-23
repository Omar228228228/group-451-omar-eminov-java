package homework_2;

public class Homework12_2 {
    public static void main(String[] args) {

        //1
        Account acc = new Account("Tom", 100);
        acc.deposit(50);
        acc.withdraw(200);
        System.out.println(acc.getBalance());

        //2
        Rectangle r = new Rectangle(2, 3);
        Rectangle r2 = r.scale(2);
        System.out.println(r.area());
        System.out.println(r2.area());

        //3
        Temperature t = new Temperature(0);
        System.out.println(t.toFahrenheit());
        Temperature t2 = Temperature.fromFahrenheit(212);
        System.out.println(t2.celsius);

        //4
        Employee e = new Employee(1000);
        Manager m = new Manager(1000);
        System.out.println(e.calculateBonus());
        System.out.println(m.calculateBonus());

        //5
        Character c = new Character("Hero", 100, 10);
        c.train().heal(20).printStats();
    }
}