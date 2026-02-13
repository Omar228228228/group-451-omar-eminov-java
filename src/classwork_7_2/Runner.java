package classwork_7_2;

public class Runner {
    public static void main(String[] args) {
        Hero hero = new Hero("Geroi", 120, 25);
        Bubu bubu = new Bubu(10000000, 2000000);
        while (hero.health > 0 && bubu.health > 0) {
            hero.attack();
            bubu.health -= hero.damage;
            System.out.println("HP Bubu: " + bubu.health);
            if (bubu.health <= 0) break;
            bubu.attack();
            hero.health -= bubu.damage;
            System.out.println("HP Geroi: " + hero.health);
        }
        if (hero.health > 0) {
            System.out.println("Geroi pobedil");
        } else {
            System.out.println("Bubu pobedil");
        }
    }
}
