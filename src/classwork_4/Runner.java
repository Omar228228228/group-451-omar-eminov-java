package classwork_4;

public class Runner {
    public static void main(String[] args) {

        OptimusPredator o = new OptimusPredator("Optimus", 200, 30, 50, true);
        o.udar();
        o.dumayet();
        o.eatyourleg();
        System.out.println(o);

        Pancake p = new Pancake("Pancake", 100, "propancake", true, 2.5);
        p.bonus();
        p.politSiropom();
        p.usilitBlina();

        CyberWolf c = new CyberWolf("Wolf", 150, 40, true, 3.2);
        c.ryvok();
        c.zheleznayaZashita();
        c.ukus();
    }
}