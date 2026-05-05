package homework17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1

        // a) if operator — eto uslovniy operator
        // b) vazhnost — upravlyaet logikoy programmy
        // c) chislo
        int number = -5;

        if (number > 0) {
            System.out.println("Chislo polozhitelnoe");
        } else if (number < 0) {
            System.out.println("Chislo otritsatelnoe");
        } else {
            System.out.println("Chislo ravno nulyu");
        }

        // d) vozrast
        int age = 17;

        if (age > 18) {
            System.out.println("Vy sovershennoletniy");
        } else {
            System.out.println("Vy eshe ne sovershennoletniy");
        }

        // e) sravnenie
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("Pervoe chislo bolshe");
        } else {
            System.out.println("Vtoroe chislo bolshe");
        }

        // f) porog
        if (args.length > 0) {
            int value = Integer.parseInt(args[0]);
            if (value > 100) {
                System.out.println("ok");
            }
        }

        // g) null
        String s = null;
        if (s != null && s.length() > 0) {
            System.out.println("has");
        }

        //2

        // a) if-else — vybor mezhdu dvumya variantami
        // b) primery iz zhizni

        Scanner sc = new Scanner(System.in);

        // c) chislo
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Polozhitelnoe");
        } else if (num < 0) {
            System.out.println("Otritsatelnoe");
        } else {
            System.out.println("Nol");
        }

        // d) dva chisla
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("Pervoe chislo bolshe");
        } else {
            System.out.println("Vtoroe chislo bolshe");
        }

        // e) vozrast kategorii
        int age2 = sc.nextInt();

        if (age2 < 13) {
            System.out.println("Detem");
        } else if (age2 < 25) {
            System.out.println("Molodym");
        } else {
            System.out.println("Vzroslym");
        }

        // f) chetnost
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        // g) maksimum dvuh
        if (args.length > 1) {
            int a1 = Integer.parseInt(args[0]);
            int b1 = Integer.parseInt(args[1]);

            if (a1 > b1) {
                System.out.println(a1);
            } else {
                System.out.println(b1);
            }
        }

        //3

        // a) if-else-if — cepochka usloviy
        // b) vazhnost — vibor iz mnogih variantov

        // c) chislo
        int num2 = sc.nextInt();

        if (num2 > 0) {
            System.out.println("Polozhitelnoe");
        } else if (num2 < 0) {
            System.out.println("Otritsatelnoe");
        } else {
            System.out.println("Nol");
        }

        // d) max iz 3
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        // e) vozrast kategorii
        int age3 = sc.nextInt();

        if (age3 < 13) {
            System.out.println("rebenok");
        } else if (age3 < 25) {
            System.out.println("molodoy");
        } else if (age3 < 60) {
            System.out.println("vzrosliy");
        } else {
            System.out.println("pozhiloy");
        }

        // f) BMI
        double bmi = sc.nextDouble();

        if (bmi < 18.5) {
            System.out.println("under");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("over");
        } else {
            System.out.println("obese");
        }

        // g) neverniy poryadok
        int test = 5;

        if (test < 100) {
            System.out.println("less than 100");
        } else if (test < 10) {
            System.out.println("less than 10");
        }

        // pravilniy poryadok
        if (test < 10) {
            System.out.println("correct: less than 10");
        } else if (test < 100) {
            System.out.println("correct: less than 100");
        }

        //4

        // a) osnovy if-else
        // b) switch — vibor po znacheniyu

        // c) chislo
        int num4 = sc.nextInt();

        if (num4 > 0) {
            System.out.println("Polozhitelnoe");
        } else if (num4 < 0) {
            System.out.println("Otritsatelnoe");
        } else {
            System.out.println("Nol");
        }

        // d) dni nedeli
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pon");
                break;
            case 2:
                System.out.println("Vtor");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetv");
                break;
            case 5:
                System.out.println("Pyat");
                break;
            case 6:
                System.out.println("Sub");
                break;
            case 7:
                System.out.println("Vosk");
                break;
            default:
                System.out.println("neverno");
        }

        // e) mesyac
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("28/29 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("31 days");
        }

        switch (month) {
            case 2:
                System.out.println("28/29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("neverno");
        }

        // f) dni iz args
        if (args.length > 0) {
            int d = Integer.parseInt(args[0]);

            switch (d) {
                case 1:
                    System.out.println("Pon");
                    break;
                case 2:
                    System.out.println("Vtor");
                    break;
                case 3:
                    System.out.println("Sreda");
                    break;
                case 4:
                    System.out.println("Chetv");
                    break;
                case 5:
                    System.out.println("Pyat");
                    break;
                case 6:
                    System.out.println("Sub");
                    break;
                case 7:
                    System.out.println("Vosk");
                    break;
                default:
                    System.out.println("error");
            }
        }

        // g) fall-through
        int demo = 1;

        switch (demo) {
            case 1:
                System.out.println("one");
            case 2:
                // net break → perehod v sledushiy case
                System.out.println("two");
                break;
        }
    }
}