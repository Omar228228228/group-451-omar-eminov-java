package chomework_42;

interface Attackable {
    void attack();
}

interface Defendable {
    void defend();
}

interface SpecialAbility {
    void useSpecial();
}

class OptimusPredator implements Attackable, Defendable, SpecialAbility {

    String name;
    int hp;
    int iq;

    OptimusPredator(String name, int hp, int iq) {
        this.name = name;
        this.hp = hp;
        this.iq = iq;
    }

    public void attack() {
        hp += 10;
    }

    public void defend() {
        hp += iq;
    }

    public void useSpecial() {
        hp += 50;
    }
}

class Pancake implements Attackable, Defendable, SpecialAbility {

    String name;
    int hp;
    double tolshina;

    Pancake(String name, int hp, double tolshina) {
        this.name = name;
        this.hp = hp;
        this.tolshina = tolshina;
    }

    public void attack() {
        hp += tolshina * 5;
    }

    public void defend() {
        hp += 15;
    }

    public void useSpecial() {
        tolshina *= 2;
    }
}

class CyberWolf implements Attackable, Defendable, SpecialAbility {

    String name;
    int hp;
    int speed;

    CyberWolf(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
    }

    public void attack() {
        speed += 5;
    }

    public void defend() {
        hp += speed;
    }

    public void useSpecial() {
        speed *= 2;
    }
}
