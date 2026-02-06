public class homework_4 {
    public static void main(String[] args) {
        int VsevoOchkov = 0;
        int KollichestvoBroskov = 15;
        Cube cube = new Cube();
        System.out.println("Игра начинается!");
        for (int i = 1; i <= KollichestvoBroskov; i++) {
            int ochki = cube.throwCube();
            System.out.println("Бросок " + i + ": " + ochki);
            VsevoOchkov += ochki;
            if (ochki == 1) {
                System.out.println("Очень плохо...");
            }
            if (ochki == 6) {
                System.out.println("Классно! Шестёрка!");
            }
        }
        System.out.println("Всего набрано очков: " + VsevoOchkov);
    }
}
class Cube {
    int throwCube() {
        return (int)(Math.random() * 6) + 1;
    }
}
