package classwork18;

public class Main {
    public static void main(String[] args) {
        // 1
        int number1 = -7;
        if (number1 > 0) {
            System.out.println("Chislo polozhitelnoe");
        } else if (number1 < 0) {
            System.out.println("Chislo otricatelnoye");
        } else {
            System.out.println("Chislo ravno nulyu");
        }
        // 2
        int number2 = 14;
        if (number2 % 2 == 0) {
            System.out.println("Chetnoe chislo");
        } else {
            System.out.println("Nechetnoe chislo");
        }
        // 3
        int a1 = 25;
        int b1 = 31;
        if (a1 > b1) {
            System.out.println("Bolshee chislo: " + a1);
        } else if (b1 > a1) {
            System.out.println("Bolshee chislo: " + b1);
        } else {
            System.out.println("Chisla ravny");
        }
        // 4
        int age = 17;
        if (age >= 18) {
            System.out.println("Dostup razreshen");
        } else {
            System.out.println("Dostup zapreshen");
        }
        // 5
        int score = 82;
        if (score < 0 || score > 100) {
            System.out.println("Nepravilnyy ball");
        } else if (score >= 90) {
            System.out.println("Otlichno");
        } else if (score >= 70) {
            System.out.println("Khorosho");
        } else if (score >= 50) {
            System.out.println("Udovletvoritelno");
        } else {
            System.out.println("Ne sdano");
        }
        // 6
        String login = "admin";
        String password = "12345";
        if (login.equals("admin") && password.equals("12345")) {
            System.out.println("Vhod vypolnen");
        } else {
            System.out.println("ne vri");
        }

        // 7
        int temperature = 32;

        if (temperature < 0) {
            System.out.println("Ochen holodno");
        } else if (temperature <= 15) {
            System.out.println("Prohladno");
        } else if (temperature <= 30) {
            System.out.println("Teplo");
        } else {
            System.out.println("jarko");
        }

        // 8
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Ponedelnik");
                break;
            case 2:
                System.out.println("Vtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetverg");
                break;
            case 5:
                System.out.println("Pyatnica");
                break;
            case 6:
                System.out.println("Subbota");
                break;
            case 7:
                System.out.println("Voskresenye");
                break;
            default:
                System.out.println("Oshibka");
        }
        // 9
        int a = 20;
        int b = 5;
        char operator = '*';
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Neizvestnaya operaciya");
        }
        // 10
        int number10 = 55;
        if (number10 >= 10 && number10 <= 100) {
            System.out.println("Chislo vhodit v diapazon");
        } else {
            System.out.println("Chislo vne diapazona");
        }
    }
}