package classwork27;

public class Main5 {
    public static void main(String[] args) {
        int[] numbers ={23,45,12,67,89,34,56,78,90,11};
        System.out.println("elementi");
        for(int i=0;i<10;i++){
            System.out.println(numbers[i]);
            if (i < 10){
                System.out.println(",");
            }
        }
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        int max = numbers[0];
        int min =numbers[0];
        for(int num:numbers){
            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }
        }
        double average = sum/10;
        int  count = 0;
        for(int num:numbers){
            if (num>average){
                count++;
            }
        }
        int[] greater =new int[count];
        int index =0;
        for(int num:numbers){
            if(num>average){
                greater[index++]=num;
            }
        }
        for(int i=0;i <10;i++){
            System.out.println(greater[i]+" ");
        }
    }
}
