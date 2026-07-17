package classwork_23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // #02 Schitaem do 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // #03 Tablitsa umnozheniya
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println();

        // #04 Summa chisel
        int sum = 0;
        int n = 1;

        while (n <= 100) {
            sum += n;
            n++;
        }

        System.out.println("Summa = " + sum);

        System.out.println();

        // #05 Chisla Fibonachchi
        int a = 1;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= 15; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println("\n");

        // #06 Obratniy otschyot
        int count = 10;

        do {
            System.out.println(count);
            count--;
        } while (count >= 1);

        System.out.println("Start!");

        System.out.println();

        // #07 Piramida iz zvezdochek
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // #08 Chetnye chisla
        for (int i = 1; i <= 30; i++) {

            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println("\n");

        // #09 Ugaday chislo
        Scanner sc = new Scanner(System.in);

        int secret = (int) (Math.random() * 20) + 1;
        int guess = 0;

        while (guess != secret) {

            System.out.print("Vvedi chislo ot 1 do 20: ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Bolshe");
            } else if (guess > secret) {
                System.out.println("Menshe");
            }
        }

        System.out.println("Ugadal!");

        System.out.println();

        // #10 Chetnoe ili nechetnoe
        System.out.print("Vvedi chislo: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Chetnoe");
        } else {
            System.out.println("Nechetnoe");
        }

        sc.close();
    }
}