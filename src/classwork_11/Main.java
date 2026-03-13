package classwork_11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        int chislo = sc.nextInt();
        if (chislo % 2 == 0) {
            System.out.println("Chislo chetnoe");
        } else {
            System.out.println("Chislo nechetnoe");
        }
        // 2
        int n = sc.nextInt();
        int summa = 0;
        for (int i = 1; i <= n; i++) {
            summa = summa + i;
        }
        System.out.println(summa);
        // 3
        int chislo2 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(chislo2 + " x " + i + " = " + (chislo2 * i));
        }
        // 4
        int[] massiv = new int[5];
        for (int i = 0; i < 5; i++) {
            massiv[i] = sc.nextInt();
        }
        int max = massiv[0];
        for (int i = 1; i < 5; i++) {
            if (massiv[i] > max) {
                max = massiv[i];
            }
        }
        System.out.println("Samoe bolshoe chislo: " + max);
        // 5
        int secret = (int)(Math.random() * 100) + 1;
        int guess = 0;
        while (guess != secret) {
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Menshe");
            } else if (guess < secret) {
                System.out.println("Bolshe");
            } else {
                System.out.println("Ty ugadal!");
            }
        }

    }
}