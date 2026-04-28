package classwork16;

public class Runner {
    //6
    static void greet(String name ){
        System.out.println("Hello my n" + name);
    }
        //15
    // static boolean isProstoy(int n){
    //     if (n<2){
    //         return false;
    //     }
    // }
    
    
    
    
    
    
    
    
    //8
    static int max3(int a,int b,int c){
        int max;
        if(a<b){
            max=a;
        } else{
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
}
