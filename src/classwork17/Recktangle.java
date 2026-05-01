package classwork17;

public class Rectangle{
    double width;
    double height;
    public Rectangle(double height, double width) {
        this height = height;
        this width = width;
    }
    public void area(width,height){
        return width*height;
    }
    public void perimetr(width,height){
        return 2*(width+height);
    }
    public void describe(){
        System.out.println("width");
        System.out.println("height");
        System.out.println(width*height);
        System.out.println(2*(width+height));
    }

}