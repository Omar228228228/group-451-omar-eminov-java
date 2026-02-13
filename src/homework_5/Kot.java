package homework_5;

public class Kot {
    String imya;
    int vozrast;
    String cvet;

    public Kot(String imya, int vozrast, String cvet) {
        this.imya = imya;
        this.vozrast = vozrast;
        this.cvet = cvet;
    }

    public void myauknut() {
        System.out.println("Myau! Ya " + imya);
    }

    public void spat() {
        System.out.println(imya + " spit... Zzz");
    }
}

