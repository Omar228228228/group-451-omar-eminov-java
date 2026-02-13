package homework_5_1;

public class Runner {

     public static void main(String[] args) {
        Uchenik u1 = new Uchenik("Anya", 7);
        Uchenik u2 = new Uchenik("Igor", 7);
        Uchenik u3 = new Uchenik("Sasha", 7);
        u1.postavitOcenku("matematika", 5);
        u1.postavitOcenku("russkiy", 4);
        u2.postavitOcenku("matematika", 3);
        u2.postavitOcenku("russkiy", 5);
        u3.postavitOcenku("matematika", 4);
        u3.postavitOcenku("russkiy", 4);
        Uchenik[] ucheniki = {u1, u2, u3};
        for (int i = 0; i < ucheniki.length; i++) {
            ucheniki[i].pokazatInformaciyu();
            System.out.println("Sredniy ball: " + ucheniki[i].sredniyBall());
        }
        double maxBall = 0;
        for (int i = 0; i < ucheniki.length; i++) {
            if (ucheniki[i].sredniyBall() > maxBall) {
                maxBall = ucheniki[i].sredniyBall();
            }
        }
        for (int i = 0; i < ucheniki.length; i++) {
            if (ucheniki[i].sredniyBall() == maxBall) {
                System.out.println("Luchshiy uchenik: " + ucheniki[i].imya);
            }
        }
    }
}

