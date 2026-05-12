package classwork_21;

public class Main {

    // 1
    static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            }
        }
    }

    // 3
    static class Rectangle {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(int width) {
            this.width = width;
            this.height = width;
        }

        public int area() {
            return width * height;
        }
    }

    // 4
    static class Counter {
        static int count = 0;

        public Counter() {
            count++;
        }

        public void destroy() {
            count--;
        }
    }

    // 5
    static class Printer {

        public void print(String value) {
            System.out.println("String: " + value);
        }

        public void print(int value) {
            System.out.println("int: " + value);
        }

        public void print(double value) {
            System.out.println("double: " + value);
        }
    }

    //6
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Point)) return false;

            Point p = (Point) obj;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }
    // 7
    static class Pizza {
        String size;
        String crust;
        String topping;

        public Pizza size(String size) {
            this.size = size;
            return this;
        }

        public Pizza crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Pizza topping(String topping) {
            this.topping = topping;
            return this;
        }
    }
    //8
    class Car{
        String carModel;
        Car(String carModel){
            this.carModel =carModel;
        }
        class Engine{
            void start(){
                System.out.println("Engine" + carModel);
            }
        }
    }
}

