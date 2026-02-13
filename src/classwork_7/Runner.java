package classwork_7;


public class Runner {
    public static void main(String[] args) {

        Pdiddy hero1 = new Pdiddy("P Diddy", 100, 30, 1);
        Epstein hero2 = new Epstein("Epstein", 105, 108, 888);

        hero1.attack();
        hero2.takeDamage(hero1.strength);

        hero2.attack();
        hero1.takeDamage(hero2.strength);

        System.out.println("Pdiddy " + hero1.health);
        System.out.println("Epstein  " + hero2.health);
    }
}