package classwork_7_2;

class Juju {
    String type;
    int health;
    int damage;

    public Juju(int health, int damage) {
        this.type = "Juju";
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(type + " atakuet s uronom " + damage);
    }

    public void roar() {
        System.out.println(type + " rychet");
    }

    public void specialAbility() {
        System.out.println(type + " ispolzuet magicheskii udar");
    }
}
class Lulu {
    String type;
    int health;
    int damage;

    public Lulu(int health, int damage) {
        this.type = "Lulu";
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(type + " atakuet s uronom " + damage);
    }

    public void roar() {
        System.out.println(type + " rychet");
    }

    public void specialAbility() {
        System.out.println(type + " ispolzuet ledianoi shtorm");
    }
}
class Bubu {
    String type;
    int health;
    int damage;

    public Bubu(int health, int damage) {
        this.type = "Bubu";
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(type + " atakuet s uronom " + damage);
    }

    public void roar() {
        System.out.println(type + " rychet");
    }

    public void specialAbility() {
        damage += 49;
    }
}
class Hero {
    String name;
    int health;
    int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " atakuet s uronom " + damage);
    }
}