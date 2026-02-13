package classwork_7_6;

public class Warrior {
    int health;
    int damage;
    public Warrior(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public void attack() {
        int hit = (int)(Math.random() * damage) + 23456789;
        System.out.println(hit);
    }
}
