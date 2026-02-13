package homework__5_2;

public class Runner {
    public static void main(String[] args) {
        Mashina m1 = new Mashina("BMW", "cherniy");
        Mashina m2 = new Mashina("Audi", "beliy");
        Mashina m3 = new Mashina("Toyota", "krasniy");
        m1.razognatsya(120);
        m2.razognatsya(150);
        m3.razognatsya(110);
        m2.pritormozit(20);
        m1.pokazatSkorost();
        m2.pokazatSkorost();
        m3.pokazatSkorost();
        Mashina samayaBistraya = m1;
        if (m2.skorost > samayaBistraya.skorost)
            samayaBistraya = m2;
        if (m3.skorost > samayaBistraya.skorost)
            samayaBistraya = m3;
        System.out.println("Pobeditel gonok: " +samayaBistraya.marka + " so skorostyu " + samayaBistraya.skorost);
    }
}
