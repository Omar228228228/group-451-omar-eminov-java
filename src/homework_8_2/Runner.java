package homework_8_2;

class Runner {
    public static void main(String[] args) {
        Animal cat = new Cat("tehteh", 3, 5);
        Animal dog = new Dog("melosh", 5, 9);
        Animal bird = new Bird("popugayoglu", 2, 4);
        cat.makeSound();
        dog.makeSound();
        bird.makeSound();
    }
}
