package Classwork_2;

import java.util.Scanner;

public class Classwork_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("napishi skolko ti spal ");
        int hours = scanner.nextInt();

        if (hours < 6) {
            System.out.println("Мало спал, пора отдохнуть!");
        } else if (hours <= 8) {
            System.out.println("Нормально, бодрый день");
        } else if (hours <= 10) {
            System.out.println("Хорошо выспался");
        } else {
            System.out.println("Переспал, пора вставать!");
        }

        System.out.print("napishi kod frukta pls");
        int code = scanner.nextInt();

        switch (code) {
            case 1 -> System.out.println("Яблоко — улучшает пищеварение");
            case 2 -> System.out.println("Банан — источник энергии");
            case 3 -> System.out.println("Апельсин — богат витамином C");
            case 4 -> System.out.println("Груша — полезна для сердца");
            case 5 -> System.out.println("Киви — укрепляет иммунитет");
            default -> System.out.println("Неверный код фрукта");
        }

        scanner.close();
    }
}