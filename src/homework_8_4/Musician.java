package homework_8_4;

import java.util.ArrayList;

public abstract class Musician {
    String name;
    int experienceYears;

    public Musician(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public abstract void playInstrument();
}

interface Soloist {
    void makeSolo();
}

class Guitarist extends Musician implements Soloist {
    public Guitarist(String name, int experienceYears) {
        super(name, experienceYears);
    }
    public void playInstrument() {
        System.out.println(name + " igraet na gitare");
    }
    public void makeSolo() {
        System.out.println(name + " delaet gitarynoe solo");
    }
}

class Drummer extends Musician {
    public Drummer(String name, int experienceYears) {
        super(name, experienceYears);
    }
    public void playInstrument() {
        System.out.println(name + " igrayet na barabanah");
    }
}

class Vocalist extends Musician implements Soloist {
    public Vocalist(String name, int experienceYears) {
        super(name, experienceYears);
    }
    public void playInstrument() {
        System.out.println(name + " poyet");
    }
    public void makeSolo() {
        System.out.println(name + " delaet vocalnoe solo");
    }
}

class Band {
    String name;
    ArrayList<Musician> musicians = new ArrayList<>();

    public Band(String name) {
        this.name = name;
    }

    public void addMusician(Musician m) {
        musicians.add(m);
    }

    public void rehearse() {
        for (Musician m : musicians) {
            m.playInstrument();
        }
    }

    public void perform() {
        System.out.println("Koncert gruppy " + name);
        int rating = (int)(Math.random() * 10) + 1;
        System.out.println("Reyting kontserta: " + rating + "/10");
    }
}