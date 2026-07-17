package classwork27;

public class Main {
    public static void main(String[] argss){
        int age =25;
        if(age<0){
            System.err.println("oshibka");
        } else if (age<12){
            System.out.println("rebenok");
        } else if (age <=17){
            System.out.println("podrostok");
        } else if (age<=64){
            System.out.println("vzrosliy");
        } else{
            System.err.println("pensioner");
        }
    }
}