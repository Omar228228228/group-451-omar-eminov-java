package homework_8_2;
public class Animal {
    String name;
    int age;
    String sound;
    int hunger;
    public Animal(String name, int age, String sound, int hunger) {
        this.name = name;
        this.age = age;
        this.sound = sound;
        this.hunger = hunger;
    }
    public void makeSound() {
        if (hunger > 8) {
            System.out.println(name + "'nayelsa'" );
        }
        else{
            System.out.println(sound);
        }
        
    }
    public void feed() {
        hunger -= 3;
        if (hunger < 0) hunger = 0;
    }
}
class Cat extends Animal {
    public Cat(String name, int age, int hunger) {
        super(name, age, "Miyav", hunger);
    }
}
class Dog extends Animal {
    public Dog(String name, int age, int hunger) {
        super(name, age, "Gav", hunger);
    }
}
class Bird extends Animal {
    public Bird(String name, int age, int hunger) {
        super(name, age, "Chik-Chirik", hunger);
    }
}

