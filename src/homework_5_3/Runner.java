package homework_5_3;

public class Runner {
    public static void main(String[] args) {
        Telefon telefon1 = new Telefon("iPhone15", "Anna");
        telefon1.dobavitKontakt(1, "Mama");
        telefon1.dobavitKontakt(2, "Drug");
        telefon1.pozvonit(1);
        telefon1.pozvonit(2);
        telefon1.pokazatKontakti();
        Telefon telefon2 = new Telefon("SamsungS23", "Ivan");
        telefon2.dobavitKontakt(1, "Brat");
        System.out.println("Telefon " + telefon1.model + " noveye chem " + telefon2.model);
    }
}

