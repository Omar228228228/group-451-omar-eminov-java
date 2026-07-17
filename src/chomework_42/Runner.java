package chomework_42;

public class Runner {
    public static void main(String[] args) {

        Attackable a = new OptimusPredator("Optimus", 200, 50);
        a.attack();

        Defendable d = new Pancake("Pancake", 120, 2.5);
        d.defend();

        SpecialAbility s = new CyberWolf("Wolf", 150, 40);
        s.useSpecial();
    }
}
