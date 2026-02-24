package classwork8_2;

public class Rectangle{
    double width;
    double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return width * height;
    }

    double getPerimetr(){
        return 2*(width + height);
    }
    void printInfo(){
        System.out.println("height:" + height);
        System.out.println("area:" + getArea());
        System.out.println("perimetr:" + getPerimetr());
    }
}