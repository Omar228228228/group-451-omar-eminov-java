package homework_19;

public class Main {

    // 1

    // a) if proveryaet uslovie i vypolnyaet kod pri true

    // b) if nuzhen dlya logiki i prinyatiya resheniy

    // c)
    public static void positiveNegativeZero(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    // d)
    public static void adultCheck(int age) {
        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы еще не совершеннолетний");
        }
    }

    // e)
    public static void compareNumbers(int first, int second) {
        if (first > second) {
            System.out.println("Первое число больше");
        } else {
            System.out.println("Второе число больше");
        }
    }

    // f)
    public static void threshold(String[] args) {
        int value = Integer.parseInt(args[0]);

        if (value > 100) {
            System.out.println("ok");
        }
    }

    // g)
    public static void nullCheck() {
        String s = null;

        if (s != null && s.length() > 0) {
            System.out.println("has");
        }
    }

    // 2

    // a) if-else vypolnyaet odno iz dvuh deystviy

    // b) primery: vozrast, svetofor, parol

    // c)
    public static void numberType(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    // d)
    public static void compareTwo(int first, int second) {
        if (first > second) {
            System.out.println("Первое число больше");
        } else {
            System.out.println("Второе число больше");
        }
    }

    // e)
    public static void ageCategory(int age) {
        if (age < 13) {
            System.out.println("Детем");
        } else if (age < 18) {
            System.out.println("Молодым");
        } else {
            System.out.println("Взрослым");
        }
    }

    // f)
    public static void parity(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    // g)
    public static void maxTwo(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // 3

    // a) if-else-if proveryaet neskolko usloviy po ocheredi

    // b) usloviya nuzhny dlya proverki vozrasta, ocenok, svetofora, BMI

    // c)
    public static void numberCheck(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }

    // d)
    public static void maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    // e)
    public static void ageGroup(int age) {
        if (age < 13) {
            System.out.println("ребенок");
        } else if (age < 18) {
            System.out.println("молодой");
        } else if (age < 60) {
            System.out.println("взрослый");
        } else {
            System.out.println("пожилой");
        }
    }

    // f)
    public static void bmiCategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("under");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("over");
        } else {
            System.out.println("obese");
        }
    }

    // g)
    public static void orderDemo(int x) {
        if (x < 100) {
            System.out.println("less than 100");
        } else if (x < 10) {
            System.out.println("less than 10");
        }
    }

    public static void orderFixed(int x) {
        if (x < 10) {
            System.out.println("less than 10");
        } else if (x < 100) {
            System.out.println("less than 100");
        }
    }

    // 4

    // a) if-else sravnivaet usloviya i vybiraet nuzhnyy variant

    // b) switch udoben dlya vybora dnya nedeli ili punkta menyu

    // c)
    public static void numberSign(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }

    // d)
    public static void dayByNumber(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный номер");
        }
    }

    // e)
    public static void monthDaysIf(int month) {
        if (month == 2) {
            System.out.println(28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }

    public static void monthDaysSwitch(int month) {
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("Неверный месяц");
        }
    }

    // f)
    public static void weekDay(String[] args) {
        int day = Integer.parseInt(args[0]);

        switch (day) {
            case 1:
                System.out.println("Пн");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
                System.out.println("Сб");
                break;
            case 7:
                System.out.println("Вс");
                break;
            default:
                System.out.println("Неверное число");
        }
    }

    // g)
    public static void fallThroughDemo(int n) {
        switch (n) {
            case 1:
                System.out.println("one");
                // fall-through
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
        }
    }

    public static void main(String[] args) {
    }
}