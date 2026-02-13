package homework_5_1;
public class Uchenik {
    String imya;
    int klass;
    int matematika;
    int russkiy;

    public Uchenik(String imya, int klass) {
        this.imya = imya;
        this.klass = klass;
        this.matematika = 0;
        this.russkiy = 0;
    }

    public void postavitOcenku(String predmet, int ocenka) {
        if (predmet.equals("matematika"))
            matematika = ocenka;
        else if (predmet.equals("russkiy"))
            russkiy = ocenka;
    }

    public double sredniyBall() {
        return (matematika + russkiy) / 2.0;
    }

    public void pokazatInformaciyu() {
        System.out.println("Imya: " + imya + ", Klass: " + klass + ", Matematika: " + matematika + ", Russkiy: " + russkiy);
    }
    
}


