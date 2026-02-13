package homework_5_3;

public class Telefon {
    String model;
    String vladelec;
    String kontakt1;
    String kontakt2;
    public Telefon(String model, String vladelec) {
        this.model = model;
        this.vladelec = vladelec;
    }
    public void dobavitKontakt(int nomer, String imya) {
        if (nomer == 1)
            kontakt1 = imya;
        else if (nomer == 2)
            kontakt2 = imya;
    }
    public void pozvonit(int nomerKontakta) {
        if (nomerKontakta == 1)
            System.out.println("Zvonyu " + kontakt1);
        else if (nomerKontakta == 2)
            System.out.println("Zvonyu " + kontakt2);
    }
    public void pokazatKontakti() {
        System.out.println("Kontakt 1: " + kontakt1);
        System.out.println("Kontakt 2: " + kontakt2);
    }
}

