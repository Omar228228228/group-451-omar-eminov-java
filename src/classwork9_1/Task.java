package classwork9_1;

public class Task {
    //1
    public static int sum(int a, int b ){
        return a + b;
    }
    //2
    public static boolean isChetniy(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    //3
    //v main
//4 
public static int findMax(int[] arr,int max){
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
    public static void main(String[] args){
        //1
        int c = sum(9,9);
        System.err.println(c);
        //2
        boolean n = isChetniy(c);
        System.out.println(n);
        //3
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    
}
