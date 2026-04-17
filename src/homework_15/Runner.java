package homework_15;

import homework_15.Main.BankAccount;
import homework_15.Main.Car;
import homework_15.Main.Circle;
import homework_15.Main.Employee;
import homework_15.Main.Laptop;
import homework_15.Main.Phone;
import homework_15.Main.User;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2020;
        System.out.println(car.brand + " " + car.model + " " + car.year);
        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 16;
        s1.grade = 4.5;
        Student s2 = new Student();
        s2.name = "Leyla";
        s2.age = 17;
        s2.grade = 4.8;
        System.out.println(s1.name + " " + s1.age + " " + s1.grade);
        System.out.println(s2.name + " " + s2.age + " " + s2.grade);
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 10;
        System.out.println("Area: " + r.getArea());
        BankAccount acc = new BankAccount();
        acc.owner = "Ali";
        acc.balance = 1000;
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Balans: " + acc.balance);
        Book book = new Book();
        book.title = "jhgfdghj";
        book.author = "me";
        book.pages = 300;
        book.displayInfo();
        Phone phone = new Phone();
        phone.brand = "Samsung";
        phone.model = "S78";
        phone.batteryLevel = 15;
        phone.call("123456789");
        phone.call("987654321");
        phone.charge();
        Employee emp = new Employee();
        emp.name = "Ali";
        emp.position = "Developer";
        emp.salary = 1000;
        emp.increaseSalary(10);
        System.out.println("Novaya zarplata: " + emp.salary);
        Laptop[] laptops = new Laptop[3];
        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = new Laptop();
        }
        laptops[0].brand = "HP";
        laptops[0].ram = 8;
        laptops[0].price = 800;
        laptops[1].brand = "Nokia";
        laptops[1].ram = 16;
        laptops[1].price = 1200;
        laptops[2].brand = "Apple";
        laptops[2].ram = 8;
        laptops[2].price = 2000;
        for (Laptop l : laptops) {
            System.out.println(l.brand + " RAM: " + l.ram + " Price: " + l.price);
        }
        User user = new User();
        user.login = "admin";
        user.password = "1234";
        System.out.println(user.checkPassword("1234"));
        System.out.println(user.checkPassword("0000"));
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Ploshad: " + c.getArea());
        System.out.println("Dlina okruzhnosti: " + c.getCircumference());
    }
}
