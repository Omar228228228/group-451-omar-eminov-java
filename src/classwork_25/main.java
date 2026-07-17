package classwork_25;

public class main{
    public static void main(String[] args) {
        //1 
        String name = "Omar";
        System.out.println("heelllooo"+name);
        //2
        int etotGod= 2026;
        int age = 14;
        int dR= etotGod-age;
        System.out.println(dR);
        //3
        double length=6;
        double width = 4;
        double area = length*width;
        System.out.println(area);
        //4
        int a=5;
        int b=4;
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println(a+b);
        //5
        int m=150;
        int h = m/60;
        System.err.println(h+m);
        //6
        double price = 100;
        double discount = 25;
        price = price- price/4;
        System.out.println(price);
        //7
        double radius = 3;
        double ares = radius*radius*Math.PI ;
        double dlina = 2*radius*Math.PI;
        System.out.println(area+""+dlina);
        //8
        String firstName = "Omar";
        String secondName = "Eminov";
        System.out.println(firstName+secondName);
        //9
        double cel = 30;
        System.out.println(cel*9/5+32);
        //10
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        //11
        int num=6;
        if(num%2==0){
            System.out.println("chetniy");
        }else{
            System.out.println("nechetniy");
        }
        //12
        int num2=6;
        int num3=6;
        if(num2<num3){
            System.out.println(num2<num3);
        } else if (num2>num3) {
            System.out.println(num2>num3);
        } else{
            System.out.println(num2=num3);
        }
        //14
        int num4=5;
        if(num4>0){
            System.out.println("polojitelniy");
        } else if (num4<0) {
            System.out.println("otricacelniy");
        } else{
            System.out.println("raven 0");
        }
        //15
    }
}