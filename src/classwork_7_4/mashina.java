package classwork_7_4;

public class mashina {
    String brand;
    int speed;
    int fuel;
    int time;
    public mashina(String brand, int speed, int fuel, int time) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.time = time;
    }
    void refuel(int litr){
        if (fuel>=0){
            fuel+=litr;
        }
    }
    void drive(boolean driving){
        if (fuel>=0){
            driving = true;
        }
        else{
            speed = 0;
            driving = false;
            System.out.println("Mashina ne yedet");
        }
    }
    void showinfo(){
        System.out.println(brand + speed + fuel);
    }
}