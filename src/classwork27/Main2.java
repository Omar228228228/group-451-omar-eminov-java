package classwork27;

public class Main2 {
    public static void main(String[] args) {
        int score =85;
        if(score<0 || score>100){
            System.out.println("neverno");
        } else if(score>=90){
            System.out.println("otlichno");
        } else if(score>=80 ){
            System.err.println("B");
        } else if(score>=70){
            System.err.println("C");
        } else if(score>=60){
            System.err.println("D");
        } else{
            System.err.println("F");
        } 
    }
}
