package homework_8_1;

public class Superhero {
    String name;
    int powerLevel;
    String secretIdentity;
    boolean isGood;

    public Superhero(String name, int powerLevel, String secretIdentity, boolean isGood) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.secretIdentity = secretIdentity;
        this.isGood = isGood;
    }

    public void showHeroCard() {
        System.out.println("name " + name);
        System.out.println("secret identify esebi " + secretIdentity);
        System.out.println("sila " + powerLevel);
        System.out.println("isGood: " + isGood);
        System.out.println();
    }

    public void usePower() {
        System.out.println( name + powerLevel );
    }

    public void moralChoice() {
        if (!isGood && Math.random() < 0.5) {
            isGood = true;
        }
    }
}

