package classwork_4;

class OptimusPredator {
    String imya;
    int zdorovye;
    int uron;
    int iq;
    boolean estNogu;

    public OptimusPredator(String imya, int zdorovye, int uron, int iq, boolean estNogu) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.uron = uron;
        this.iq = iq;
        this.estNogu = estNogu;
    }

    void udar() {
        uron += 10;
    }

    void dumayet() {
        zdorovye += iq;
    }

    void eatyourleg() {
        if (estNogu) {
            zdorovye += 50;
        }
    }
}

class Pancake {
    String imya;
    int zdorovye;
    String secret;
    boolean nastoyashiy;
    double tolshina;

    public Pancake(String imya, int zdorovye, String secret, boolean nastoyashiy, double tolshina) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.secret = secret;
        this.nastoyashiy = nastoyashiy;
        this.tolshina = tolshina;
    }

    void bonus(){
        if ("propancake".equals(secret)){
            zdorovye = 999999999;
        }
    }

    void politSiropom() {
        zdorovye += 20;
    }

    void usilitBlina() {
        
        zdorovye += tolshina * 10;
    }
}

class Gigacucumber {
    String imya;
    int zdorovye;
    double hrust;
    boolean zeleniy;
    int semechki;

    public Gigacucumber(String imya, int zdorovye, double hrust, boolean zeleniy, int semechki) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.hrust = hrust;
        this.zeleniy = zeleniy;
        this.semechki = semechki;
    }

    void ukus() {
        hrust += 1.5;
    }

    void fotosintez() {
        if (zeleniy) {
            zdorovye += 30;
        }
    }

    void brosokSemechek() {
        semechki -= 2;
    }
}

class Rexona {
    String imya;
    int zdorovye;
    int svezhest;
    boolean ogonRyadom;
    double radius;

    public Rexona(String imya, int zdorovye, int svezhest, boolean ogonRyadom, double radius) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.svezhest = svezhest;
        this.ogonRyadom = ogonRyadom;
        this.radius = radius;
    }

    void raspylit() {
        svezhest += 10;
    }

    void zashitaZapaha() {
        zdorovye += svezhest;
    }

    void peregrev() {
        if (ogonRyadom) {
            zdorovye = 0;
        }
    }
}

class CyberWolf {
    String imya;
    int zdorovye;
    int skorost;
    boolean metalSherst;
    double silaUkusa;

    public CyberWolf(String imya, int zdorovye, int skorost, boolean metalSherst, double silaUkusa) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.skorost = skorost;
        this.metalSherst = metalSherst;
        this.silaUkusa = silaUkusa;
    }

    void ryvok() {
        skorost += 10;
    }

    void zheleznayaZashita() {
        if (metalSherst) {
            zdorovye += 25;
        }
    }

    void ukus() {
        zdorovye += skorost;
    }
}

class SlimeCube {
    String imya;
    int zdorovye;
    double kislota;
    boolean delitsya;
    int razmer;

    public SlimeCube(String imya, int zdorovye, double kislota, boolean delitsya, int razmer) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.kislota = kislota;
        this.delitsya = delitsya;
        this.razmer = razmer;
    }

    void razedat() {
        kislota += 0.5;
    }

    void pogloshenie() {
        zdorovye += razmer;
    }

    void razdelenie() {
        if (delitsya) {
            razmer++;
        }
    }
}

class BoneSkeleton {
    String imya;
    int zdorovye;
    int kosti;
    boolean proklyat;
    double tochnost;

    public BoneSkeleton(String imya, int zdorovye, int kosti, boolean proklyat, double tochnost) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.kosti = kosti;
        this.proklyat = proklyat;
        this.tochnost = tochnost;
    }

    void brosokKosti() {
        kosti--;
    }

    void pochinka() {
        zdorovye += kosti;
    }

    void proklyatie() {
        if (proklyat) {
            tochnost += 1;
        }
    }
}

class FireToaster {
    String imya;
    int zdorovye;
    double zhar;
    boolean vRozetke;
    int hleb;

    public FireToaster(String imya, int zdorovye, double zhar, boolean vRozetke, int hleb) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.zhar = zhar;
        this.vRozetke = vRozetke;
        this.hleb = hleb;
    }

    void podzharit() {
        zhar += 10;
    }

    void peregruz() {
        if (vRozetke) {
            zdorovye -= 20;
        }
    }

    void sdelatTost() {
        hleb--;
    }
}

class MutantDuck {
    String imya;
    int zdorovye;
    int zlost;
    boolean radiaciya;
    double silaKryaka;

    public MutantDuck(String imya, int zdorovye, int zlost, boolean radiaciya, double silaKryaka) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.zlost = zlost;
        this.radiaciya = radiaciya;
        this.silaKryaka = silaKryaka;
    }

    void kryak() {
        zlost += 5;
    }

    void vzmah() {
        zdorovye += silaKryaka * 5;
    }

    void radioUdar() {
        if (radiaciya) {
            zlost += 20;
        }
    }
}

class ShadowLamp {
    String imya;
    int zdorovye;
    double tma;
    boolean slomana;
    int zaryad;

    public ShadowLamp(String imya, int zdorovye, double tma, boolean slomana, int zaryad) {
        this.imya = imya;
        this.zdorovye = zdorovye;
        this.tma = tma;
        this.slomana = slomana;
        this.zaryad = zaryad;
    }

    void temnoSvetit() {
        tma += 2;
    }

    void vysosatSvet() {
        zaryad += 10;
    }

    void razbit() {
        if (slomana) {
            zdorovye = 0;
        }
    }
}