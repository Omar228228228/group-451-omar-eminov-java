package classwork19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 2
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 3
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println( sum);
        // 4
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
        // 5
        int i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        // 6
        int number1 = 58342;
        int count = 0;
        int temp = number1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
        // 7
        int num2 = 4567;
        int sum2 = 0;
        int aa = num2;
        while (aa != 0) {
            sum2 += aa % 10;
            aa /= 10;
        }
        System.out.println(sum2);

        // 8
        int choice;
        do {
            System.out.println("1.start");
            System.out.println("2.setting");
            System.out.println("3.Quit");
            choice = 3;
        } while (choice != 3);

        // 9
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("password");
            password = sc.nextLine();
        } while (!password.equals("java123"));

        // 10
        for (int j = 1; j <= 20; j++) {
            if (j % 3 == 0) continue;
            System.out.print(j + " ");
        }
        System.out.println();

        // 11
        for (int k = 1; k <= 100; k++) {
            if (k > 25) break;
            System.out.print(k + " ");
        }
        System.out.println();

        // 12
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 13
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 14
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }

        // 15
        for (int x = 2; x <= 100; x++) {
            boolean isPrime = true;
            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(x + " ");
            }
        }

        System.out.println();

        // 16
        int secret = 2;
        int guess;

        do {
            System.out.print("ugaday");
            guess = sc.nextInt();
        } while (guess != secret);

        System.out.println("molodes!");

        sc.close();
    }
}