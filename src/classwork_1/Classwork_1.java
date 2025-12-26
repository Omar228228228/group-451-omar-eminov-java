package classwork_1;

import java.util.Scanner;

public class Classwork_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Вы взрослый");
        else System.out.println("Вы ещё ребёнок");

        // 2
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        if (number > 0) System.out.println("Положительное");
        else System.out.println("Отрицательное или ноль");

        // 3
        int grade = 4;
        if (grade == 5) System.out.println("Отлично");
        else if (grade == 4) System.out.println("Хорошо");
        else if (grade == 3) System.out.println("Удовлетворительно");
        else System.out.println("Неудовлетворительно");

        // 4
        int temp = 20;
        if (temp > 25) System.out.println("Жарко");
        else if (temp >= 10) System.out.println("Тепло");
        else System.out.println("Холодно");

        // 5
        int day = 3;
        switch(day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }

        // 6
        char letterGrade = 'B';
        switch(letterGrade) {
            case 'A' -> System.out.println("Отлично");
            case 'B' -> System.out.println("Хорошо");
            case 'C' -> System.out.println("Средне");
            case 'D' -> System.out.println("Плохо");
            case 'F' -> System.out.println("Не сдал");
        }

        // 7
        int num1 = 10, num2 = 5;
        if (num1 > num2) System.out.println("Первое больше");
        else System.out.println("Второе не меньше");

        // 8
        int hour = 14;
        if (hour >= 6 && hour <= 11) System.out.println("Утро");
        else if (hour >= 12 && hour <= 17) System.out.println("День");
        else if (hour >= 18 && hour <= 22) System.out.println("Вечер");
        else System.out.println("Ночь");

        // 9
        int month = 7;
        switch(month) {
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
        }

        // 10
        int num = 8;
        if (num % 2 == 0) System.out.println("Чётное");
        else System.out.println("Нечётное");

        // 11
        char gender = 'М';
        if (gender == 'М') System.out.println("Привет, парень!");
        else if (gender == 'Ж') System.out.println("Привет, девочка!");
        else System.out.println("Не понял пол");

        // 12
        int score = 80;
        if (score >= 90) System.out.println("5");
        else if (score >= 75) System.out.println("4");
        else if (score >= 50) System.out.println("3");
        else System.out.println("2");

        // 13
        String trafficColor = "зелёный";
        switch(trafficColor) {
            case "красный" -> System.out.println("Стоять");
            case "жёлтый" -> System.out.println("Приготовиться");
            case "зелёный" -> System.out.println("Можно идти");
        }

        // 14
        int age2 = 10;
        if (age2 < 7) System.out.println("Детский сад");
        else if (age2 <= 17) System.out.println("Школа");
        else System.out.println("Взрослый");

        // 15
        int quarter = 2;
        switch(quarter) {
            case 1 -> System.out.println("Первая четверть");
            case 2 -> System.out.println("Вторая четверть");
            case 3 -> System.out.println("Третья четверть");
            case 4 -> System.out.println("Четвертая четверть");
        }

        // 16
        int height = 175;
        if (height < 150) System.out.println("Низкий");
        else if (height <= 180) System.out.println("Средний");
        else System.out.println("Высокий");

        // 17
        int points = 120;
        if (points > 100) System.out.println("Победитель!");
        else System.out.println("Попробуй ещё");

        // 18
        char op = '+';
        switch(op) {
            case '+' -> System.out.println("Сложение");
            case '-' -> System.out.println("Вычитание");
            case '*' -> System.out.println("Умножение");
            case '/' -> System.out.println("Деление");
        }

        // 19
        String weekDay = "суббота";
        switch(weekDay) {
            case "понедельник", "вторник", "среда", "четверг", "пятница" -> System.out.println("Рабочий день");
            case "суббота", "воскресенье" -> System.out.println("Выходной");
        }

        // 20
        int luckyNumber = 7;
        int guess = 5;
        if (guess == luckyNumber) System.out.println("Угадал!");
        else System.out.println("Не угадал");

        // 21
        int a = 10, b = 10;
        if (a == b) System.out.println("Равны");
        else System.out.println("Разные");

        // 22
        int waterTemp = 50;
        if (waterTemp <= 0) System.out.println("Лёд");
        else if (waterTemp < 100) System.out.println("Вода");
        else System.out.println("Пар");

        // 23
        int errorCode = 404;
        switch(errorCode) {
            case 404 -> System.out.println("Страница не найдена");
            case 500 -> System.out.println("Ошибка сервера");
            case 200 -> System.out.println("Все ок");
        }

        // 24
        int pets = 2;
        if (pets == 0) System.out.println("Нет питомцев");
        else if (pets == 1) System.out.println("Один питомец");
        else System.out.println("Много питомцев");

        // 25
        int behavior = 4;
        if (behavior < 4) System.out.println("Поговорим с родителями");
        else System.out.println("Молодец");

        // 26
        int planetNum = 3;
        switch(planetNum) {
            case 1 -> System.out.println("Меркурий");
            case 2 -> System.out.println("Венера");
            case 3 -> System.out.println("Земля");
            case 4 -> System.out.println("Марс");
            case 5 -> System.out.println("Юпитер");
            case 6 -> System.out.println("Сатурн");
            case 7 -> System.out.println("Уран");
            case 8 -> System.out.println("Нептун");
        }

        // 27
        int wind = 40;
        if (wind > 50) System.out.println("Ураган");
        else if (wind >= 30) System.out.println("Сильный ветер");
        else System.out.println("Спокойно");

        // 28
        int answer = 4;
        if (answer == 4) System.out.println("Правильно!");
        else System.out.println("Неправильно");

        // 29
        int shoeSize = 41;
        if (shoeSize < 35) System.out.println("Детский");
        else if (shoeSize <= 42) System.out.println("Женский");
        else System.out.println("Мужской");

        // 30
        String lang = "ru";
        switch(lang) {
            case "en" -> System.out.println("Hello");
            case "ru" -> System.out.println("Привет");
            case "es" -> System.out.println("Hola");
            case "fr" -> System.out.println("Bonjour");
        }

        // 31
        int players = 3;
        if (players == 2) System.out.println("Дуэль");
        else if (players <= 4) System.out.println("Малая команда");
        else System.out.println("Большая команда");

        // 32
        int battery = 15;
        if (battery < 20) System.out.println("Заряди телефон!");
        else System.out.println("Всё ок");

        // 33
        int floor = 12;
        if (floor > 10) System.out.println("Высокий этаж");
        else System.out.println("Низкий");

        // 34
        String subject = "математика";
        switch(subject) {
            case "математика" -> System.out.println("Считай больше!");
            case "русский" -> System.out.println("Пиши аккуратно!");
            case "физкультура" -> System.out.println("Беги быстрее!");
        }

        // 35
        int dice = 5;
        switch(dice) {
            case 1 -> System.out.println("Шаг вперёд");
            case 2 -> System.out.println("Шаг назад");
            case 3 -> System.out.println("Пропусти ход");
            case 4 -> System.out.println("Брось ещё раз");
            case 5 -> System.out.println("Возьми карту");
            case 6 -> System.out.println("Умножь очки");
        }

        // 36
        int zodiacMonth = 3;
        switch(zodiacMonth) {
            case 1 -> System.out.println("Козерог");
            case 2 -> System.out.println("Водолей");
            case 3 -> System.out.println("Рыбы");
            case 4 -> System.out.println("Овен");
            case 5 -> System.out.println("Телец");
            case 6 -> System.out.println("Близнецы");
            case 7 -> System.out.println("Рак");
            case 8 -> System.out.println("Лев");
            case 9 -> System.out.println("Дева");
            case 10 -> System.out.println("Весы");
            case 11 -> System.out.println("Скорпион");
            case 12 -> System.out.println("Стрелец");
        }

        // 37
        int candies = 8;
        if (candies > 10) System.out.println("Слишком много сладкого!");
        else System.out.println("Можно съесть");

        // 38
        int country = 7;
        switch(country) {
            case 7 -> System.out.println("Москва");
            case 1 -> System.out.println("Вашингтон");
            case 44 -> System.out.println("Лондон");
        }

        // 39
        String ans = "да";
        if (ans.equals("да")) System.out.println("Согласен");
        else if (ans.equals("нет")) System.out.println("Не согласен");
        else System.out.println("Не понял");

        // 40
        int minutes = 3;
        if (minutes < 5) System.out.println("Скоро звонок!");
        else System.out.println("Ещё долго");

        // 41
        String transport = "велосипед";
        switch(transport) {
            case "автобус" -> System.out.println("40 км/ч");
            case "метро" -> System.out.println("60 км/ч");
            case "велосипед" -> System.out.println("15 км/ч");
        }

        // 42
        int licho_omara = 4;
        switch(licho_omara) {
            case 1 -> System.out.println(":(");
            case 2 -> System.out.println(":/");
            case 3 -> System.out.println(":|");
            case 4 -> System.out.println(":)");
            case 5 -> System.out.println(":D");
        }

        // 43
        int errors = 2;
        if (errors == 0) System.out.println("Отлично!");
        else if (errors <= 3) System.out.println("Хорошо");
        else System.out.println("Надо потренироваться");

        // 44
        int animal = 2;
        switch(animal) {
            case 1 -> System.out.println("Мяу");
            case 2 -> System.out.println("Гав");
            case 3 -> System.out.println("Чирик");
        }

        // 45
        int weight = 5;
        if (weight < 1) System.out.println("Письмо");
        else if (weight <= 10) System.out.println("Посылка");
        else System.out.println("Груз");

        // 46
        int finger = 3;
        switch(finger) {
            case 1 -> System.out.println("Большой");
            case 2 -> System.out.println("Указательный");
            case 3 -> System.out.println("Средний");
            case 4 -> System.out.println("Безымянный");
            case 5 -> System.out.println("Мизинец");
        }

        // 47
        char test = 'B';
        if (test == 'A' || test == 'B') System.out.println("Прошёл");
        else System.out.println("Не прошёл");

        // 48
        int level = 7;
        if (level == 10) System.out.println("Максимальный уровень!");
        else System.out.println("Ещё качаться");

        // 49
        int weather = 2;
        switch(weather) {
            case 1 -> System.out.println("Надень лёгкую одежду");
            case 2 -> System.out.println("Возьми зонт");
            case 3 -> System.out.println("Надень шапку и пальто");
        }

        // 50
        String color = "red";
        switch(color) {
            case "red" -> System.out.println("Красный");
            case "green" -> System.out.println("Зелёный");
            case "blue" -> System.out.println("Синий");
        }

    }
}