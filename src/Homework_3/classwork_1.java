package Homework_3;
import java.util.Scanner;
public class classwork_1 {
	 public static void main(String[] args) {
	     for (int i=1;i<=10;i++) {
	    	 System.out.println(i);
	     }
//	     2
	     int[] fruits = {1, 0, 0, 1, 1, 0};
	     int count = 0;
	     
	     System.out.println("Vse elementi");
	     for (int f:fruits) {
	    	 System.out.println(f + " ");
	     }
	     System.out.println("tolko edinici");
	     for (int f:fruits) {
	    	 if(f==1) {
	    		 System.out.println(f);
	    		 count++;
	    	 }
	     }
	     System.out.println(count);
//	     333333333333333333333333333333
	     int i=1;
	     while(i<10) {
	    	 System.out.println(i);
	    	 i++;
	     }
	     int j=10;
	     while(j>=1) {
	    	 System.out.println(j);
	    	 j--;
	     }
//	     444444444444444444444444
	     Scanner scanner = new Scanner(System.in);
	     String password;

	     do {
	         System.out.print("Введите пароль: ");
	       password = scanner.nextLine();
	        } while (!password.equals("java123"));

	        System.out.println("Добро пожаловать!");
	  }
}
