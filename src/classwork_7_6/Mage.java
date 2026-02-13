package classwork_7_6;

public class Mage {
    int health;
    int damage;
    int mana;
    public Mage(int health, int damage, int mana) {
        this.health = health;
        this.damage = damage;
        this.mana = mana;
    }
    public void attack() {
        if (mana > 0) {
            int hit = (int)(Math.random() * damage) + 1;
            mana -= 5;
            System.out.println(hit);
        }
    }
}