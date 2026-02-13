package homework_5;

public class Runner {
    public static void main(String[] args) {
        Kot k1 = new Kot("Murzik", 3, "seriy");
        Kot k2 = new Kot("Barsik", 1, "rijiy");
        Kot k3 = new Kot("Tom", 4, "cherniy");
        Kot k4 = new Kot("Pushok", 2, "beliy");
        k1.myauknut();
        k2.myauknut();
        k3.myauknut();
        k4.myauknut();
        k1.spat();
        k3.spat();
        System.out.println("Vozrast kota: " + k1.vozrast);
        k1.vozrast = k1.vozrast + 1;
        System.out.println("Posle dnya rozhdeniya: " + k1.imya + " teper " + k1.vozrast + " let");
    }
}

