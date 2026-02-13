package classwork_7_4;

public class Runner {
    public static void main(String[] args) {
        mashina car1 = new mashina("BMW", 120, 50, 2);
        mashina car2 = new mashina("Toyota", 100, 30, 1);
        car1.refuel(20);
        car2.refuel(10);
        car1.showinfo();
        car2.showinfo();
    }
}
