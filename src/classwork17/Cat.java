package classwork17;

public class Cat {
    String name;
    String color;
    int age;
    public Cat(String name, String color, int age) {
        this.name  = name;
        this.color = color;
        this.age   = age;
    }
    public void meow() {
        System.out.println("Miyyyaaaav menya zvat" + name);
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Mirza","Cherniy", 3);
        cat.meow();
    }
}