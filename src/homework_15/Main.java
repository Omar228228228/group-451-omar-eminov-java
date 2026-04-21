package homework_15;

public class Main {
    static class Car {
        String brand;
        String model;
        int year;
    }
    static class Student {
        String name;
        int age;
        double grade;
    }
    static class Rectangle {
        double width;
        double height;

        double getArea() {
            return width * height;
        }
    }
    static class BankAccount {
        String owner;
        double balance;

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Net deneg");
            }
        }
    }
    static class Book {
        String title;
        String author;
        int pages;

        void displayInfo() {
            System.out.println(title + " - " + author + ", pages: " + pages);
        }
    }
    static class Phone {
        String brand;
        String model;
        int batteryLevel;

        void call(String number) {
            if (batteryLevel < 10) {
                System.out.println("Malo zaryada");
            } else {
                System.out.println("Zvonok na " + number);
                batteryLevel -= 10;
            }
        }

        void charge() {
            batteryLevel = 100;
            System.out.println("Zaryazhen");
        }
    }
    static class Employee {
        String name;
        String position;
        double salary;

        void increaseSalary(double percent) {
            salary += salary * percent / 100;
        }
    }
    static class Laptop {
        String brand;
        int ram;
        double price;
    }
    static class User {
        String login;
        String password;

        boolean checkPassword(String input) {
            return password.equals(input);
        }
    }
    static class Circle {
        double radius;
        double getArea() {
            return Math.PI * radius * radius;
        }
        double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }
    
}