package classwork_7_6;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Archer");

        int choice = sc.nextInt();

        if (choice == 1) {
            Warrior w = new Warrior(100, 20);
            w.attack();
            System.err.println("ti alfa samech ultra W sigma");
        }

        if (choice == 2) {
            Mage m = new Mage(80, 25, 50);
            m.attack();
        }

        if (choice == 3) {
            Archer a = new Archer(90, 18);
            a.attack();
        }
    }
}


