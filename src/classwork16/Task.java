package classwork16;

public class Task{
    public static void main(String[] args) {
        //1
        System.out.println("Hello World");
        //2
        for (int i = 1;i<=10;i++ ){
            System.out.println(i);
        }
        //3 
        int age =14;
        int future = age+10;
        System.out.println("Mne budet"+ future);
        //4
        int n=7;
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //5
        int sum = 0;
        for (int i = 1; i <=100;i++){
            sum += i;
        }
        System.out.println(sum);
        //7
        for (int i=1; i<=10;i++){
            System.out.println("3 *"+i+"="+3*i);
        }
        //9
        String name = "Aleksandr";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        //10
        for (int i = 1;i<=5;i++){
            for (int j =1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        //11
        int [] favorites = {7,13,42,100,777};
        for(int num : favorites){
            System.out.println(num);
        }
        //12
        int guess = 20;
        if (guess<42){
            System.out.println("<");
        }else if(guess>42){
            System.out.println(">");
        }
        else{
            System.out.println("win");
        }
        //13
        class Animal{
            String name;
            String sound;
            Animal(String name, String sound){
                this.name= name;
                this.sound=sound;
            }
            void speak(){
                System.out.println("Hi i want to eat");
            }

        }
        //15

    }
}