package homework_2;

//1
class Account {
    private String owner;
    private double balance;

    Account(String o, double b) {
        owner = o;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) balance -= 0; // можно заменить на любую логику
        else balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

//2
class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    Rectangle scale(double factor) {
        return new Rectangle(width * factor, height * factor);
    }
}

//3
class Temperature {
    double celsius;

    Temperature(double c) {
        celsius = c;
    }

    double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9);
    }
}

//4
class Employee {
    double salary;

    Employee(double s) {
        salary = s;
    }

    double calculateBonus() {
        return salary * 0.1;
    }
}

class Manager extends Employee {
    Manager(double s) {
        super(s);
    }

    double calculateBonus() {
        return super.calculateBonus() + 50;
    }
}

//5
class Character {
    String name;
    int health;
    int strength;

    Character(String n, int h, int s) {
        name = n;
        health = h;
        strength = s;
    }

    Character heal(int v) {
        health += v;
        return this;
    }

    Character train() {
        strength++;
        return this;
    }

    void printStats() {
        System.out.println(name + " " + health + " " + strength);
    }
}