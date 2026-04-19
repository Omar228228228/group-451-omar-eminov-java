package classwork14;

public class task {

    public static void main(String[] args) {
        //5
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
    }

    // 1
    static class Dog {
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void bark() {
            System.out.println("Woof! I'm " + name);
        }
    }

    // 2
    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException();
            }
            this.age = age;
        }
    }

    // 3
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // 4
    static class Animal {
        void speak() {
            System.out.println("Ya ustal");
        }
    }

    static class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Meow!");
        }
    }
    //6
    class BankAccount {
        String owner;
        double balance;

        void deposit(double amount) {
            if (amount > 0) balance += amount;
        }   

        void withdraw(double amount) {
            if (amount > 0 && balance >= amount) balance -= amount;
        }

        double getBalance() {
            return balance;
        }
    }
    //8
    interface Drawable {
        void draw();
    }

    class Circle implements Drawable {
        double radius;

    Circle(double r) { 
        radius = r; 
    }
    public void draw() {
        System.out.println("Circle radius=" + radius);
    }
    //10
    static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }
    //10
    class MathUtils {
        static int factorial(int n) {
            if (n < 0) {
                System.out.println("kjhgftdsfghjkl");;
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
        static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
    //11
    abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base; 
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

    class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        double area() {
            return side * side;
        }
    }
}

}

