package classwork17;

public class Car{
    String brand;
    String model;
    int year;
    int speed;
    public Car(double balance) {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.speed=speed;
    }
    public void accelerate(int kmh){
        int kmh = 200-speed;
        return speed+kmh
    }
    public void brake(int kmh){
        if (speed+kmh<200){
            return speed+kmh;
        }
        else if(speed+kmh>200){
            System.out.println("nelza")
        }
    }
    public void toString(){
        System.out.println(brand+model+year+speed)
    }
}