package classwork_7;


class Epstein {
    String name;
    int health;
    int strength;
    int level;
    public  Epstein(String name, int health, int strength, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }
    public void attack() {
        System.out.println(name + " атакует с силой " + strength);
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        
    }
}
class Pdiddy {
    String name;
    int health;
    int strength;
    int level;
    public Pdiddy(String name, int health, int strength, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }
    public void attack() {
        System.out.println(name + " атакует с силой " + strength);
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
}