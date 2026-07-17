package homework_14_1;

public class MathHelper {
    MathHelper(){}
    
    public static int square(int n) {
        return n*n;
    }
    
    public static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }
        return false;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
