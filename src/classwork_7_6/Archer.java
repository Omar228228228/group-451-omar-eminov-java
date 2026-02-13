package classwork_7_6;

public class Archer {
    int health;
    int damage;
    public Archer(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public void attack() {
        int hit = (int)(Math.random() * damage) + 1;
        System.out.println(hit);
    }
}
