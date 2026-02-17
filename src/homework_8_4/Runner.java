package homework_8_4;

public class Runner {
    public static void main(String[] args) {
        Guitarist g = new Guitarist("Alex", 5);
        Drummer d = new Drummer("Max", 3);
        Vocalist v = new Vocalist("Lena", 4);
        Band band = new Band("RockStars");
        band.addMusician(g);
        band.addMusician(d);
        band.addMusician(v);
        band.rehearse();
        band.perform();
    }
}
