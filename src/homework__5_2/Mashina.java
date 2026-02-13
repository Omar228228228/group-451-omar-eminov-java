package homework__5_2;

public class Mashina {
    String marka;
    String cvet;
    int skorost;
    public Mashina(String marka, String cvet) {
        this.marka = marka;
        this.cvet = cvet;
        this.skorost = 0;
    }
    public void razognatsya(int naSkolko) {
        skorost += naSkolko;
    }
    public void pritormozit(int naSkolko) {
        skorost -= naSkolko;
        if (skorost < 0)
            skorost = 0;
    }
    public void pokazatSkorost() {
        System.out.println(marka + " edet so skorostyu " + skorost);
    }
}