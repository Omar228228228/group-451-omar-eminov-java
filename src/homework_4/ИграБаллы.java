package homework_4;

public class ИграБаллы {
    public static void main(String[] args) {
        int[] баллы = {120, 85, 200, 95, 150, 60, 175, 110};
        int лучшийСчёт = баллы[0];
        int худшийСчёт = баллы[0];
        for (int i = 1; i < баллы.length; i++) {
            лучшийСчёт = Math.max(лучшийСчёт, баллы[i]);
            худшийСчёт = Math.min(худшийСчёт, баллы[i]);
        }
        System.out.println("Лучший результат: " + лучшийСчёт);
        System.out.println("Худший результат: " + худшийСчёт);
        int разница = лучшийСчёт - худшийСчёт;
        System.out.println("Разница между лучшим и худшим: " + разница + " баллов");
        if (разница > 100) {
            System.out.println("Очень большая разница!");
        }
    }
}
