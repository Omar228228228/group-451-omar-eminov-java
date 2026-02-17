package homework_8_1;

public class Runner {
    public static void main(String[] args) {

        Superhero h1 = new Superhero("Esebigaga", 80, "h", true);
        Superhero h2 = new Superhero("optimus", 95, "x", false);
        Superhero h3 = new Superhero("marinovaniy", 88, "a", true);

        h1.showHeroCard();
        h2.showHeroCard();
        h3.showHeroCard();

        h2.moralChoice();

        Superhero winner = (h1.powerLevel > h2.powerLevel) ? h1 : h2;

        System.out.println("winner " + winner.name);
    }
}