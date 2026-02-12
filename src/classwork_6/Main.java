package classwork_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1 
        System.out.println("Chislo nopishi");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("chetnoye");
        } else {
            System.out.println("nechetnoye");
        }

        //2
        System.out.println(" chislo nopishi");
        int num2 = sc.nextInt();
        if (num2 > 0) {
            System.out.println("+");
        } else if (num2 < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }

        // 3
        System.out.println(" na 5");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // 4
        int sum100 = 0;
        for (int i = 1; i <= 100; i++) {
            sum100 += i;
        }
        System.out.println(" summa chisel ot 1 do 100" + sum100);

        // 5
        System.out.println("gaday eeee");
        int secret = 7;
        int guess = 0;
        while (guess != secret) {
            guess = sc.nextInt();
            if (guess < secret) {
                System.out.println(">");
            } else if (guess > secret) {
                System.out.println("<");
            } else {
                System.out.println("molodes");
            }
        }

        // 6
        System.out.println("chetniy chisla vot tak pishut aee");
        int omar = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                omar++;
            }
        }
        System.out.println("chetniyie " + omar);

        // 7
        System.out.println("factorial");
        int factNum = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println(factNum + "! = " + factorial);

        // 8
        System.out.println("nopishi 5 chisel eee");
        int max = sc.nextInt();
        for (int i = 1; i < 5; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("maxium vot takoy bivayet " + max);

        // 9
        System.out.println("dlina shirina pishi aee");
        int height = sc.nextInt();
        int width = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 10
        System.out.println("piramida giza bivayet vot takoy:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 11
        System.out.println("n vvedi aeeee");
        int N = sc.nextInt();
        int sumEven = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("chetniy sum vot takoy bivayet " + sumEven);

        // 12
        System.out.println("password ot pintagena");
        sc.nextLine(); 
        String password = "";
        while (password.equals("java123")) {
            password = sc.nextLine();
        }
        System.out.println("oroxodi aeee");

        sc.close();
    }
}