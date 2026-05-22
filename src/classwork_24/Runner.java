package classwork_24;

import java.util.Scanner;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //2
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j<=9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        //3
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        //4


        //5
        int d = 10;

        do {
            System.out.println(d);
            d--;
        } while (d >= 1);

        System.out.println("Start");

        //6
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //7
        for (int x = 1; x <= 30; x++) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.print(x + " ");
        }

        System.out.println();

        //8
        int secret = (int)(Math.random() * 20) + 1;
        int guess = 0;

        while (true) {
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println(">");
            }

            if (guess > secret) {
                System.out.println("<");
            }

            if (guess == secret) {
                System.out.println("bingo");
                break;
            }
        }

        //9
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("chetniy");
        } else {
            System.out.println("nechetniy");
        }

        //10
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        if ((a1 >= b1) && (a1 >= c1)) {
            System.out.println(a1);
        } else if ((b1 >= a1) && (b1 >= c1)) {
            System.out.println(b1);
        } else {
            System.out.println(c1);
        }

        //11
        int score = sc.nextInt();

        if ((score >= 90) && (score <= 100)) {
            System.out.println("great");
        } else if ((score >= 70) && (score <= 89)) {
            System.out.println("good");
        } else if ((score >= 50) && (score <= 69)) {
            System.out.println("not bad");
        } else {
            System.out.println("bad");
        }

        //12
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(x + y);
        } else if (op == '-') {
            System.out.println(x - y);
        } else if (op == '*') {
            System.out.println(x * y);
        } else if (op == '/') {
            if (y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("error");
            }
        }

        //13
        int year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("visokosniy");
        } else {
            System.out.println("ne visokosniy");
        }

        //14
        int month = sc.nextInt();
        int day = sc.nextInt();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("ovem");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.println("celec");
        } else {
            System.out.println("durugoy");
        }

        //15
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {

            if ((s1 == s2) && (s2 == s3)) {
                System.out.println("=str");
            } else if ((s1 == s2) || (s2 == s3) || (s1 == s3)) {
                System.out.println("=bedr");
            } else {
                System.out.println("!=str");
            }

        } else {
            System.out.println("nevazmojno");
        }

        //16


        //17
        int[] arr1 = {10, 20, 30, 40, 50};

        for (int j = 0; j < arr1.length; j++) {
            System.out.println("[" + j + "] = " + arr1[j]);
        }

        //18
        int[] arr2 = new int[8];

        for (int a = 0; a < arr2.length; a++) {
            arr2[a] = (int)(Math.random() * 100);
        }

        int min = arr2[0];
        int max = arr2[0];

        for (int v : arr2) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(min);
        System.out.println(max);

        //19
        double[] arr3 = {5, 4, 3, 5, 4, 5, 3, 5, 4, 5};
        double sum2 = 0;
        for (double v : arr3) {
            sum2 = sum2 + v;
        }
        System.out.println(sum2);
        System.out.println(sum2 / arr3.length);
        //20
        //??
    }
}