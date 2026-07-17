package homework_18;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        char[]a = password.toCharArray();
        int number = 0;
        int big = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                number++;
            }
            if (a[i] >= 'A' && a[i] <= 'Z') {
                big++;
            }
        }
        if (a.length >= 8 && number > 0 && big > 0) {
            System.out.println("Надёжный пароль");
        } else {
            System.out.println("Слабый пароль");
        }
        //2
    }
}