package classwork27;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Vvedite n: ");
        n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Faktorial dlya otricatelnih chisel ne opredelen.");
        } else if (n == 0) {
            System.out.println("0! = 1");
        } else {
            int summa = 0;
            int i = 1;

            while (i <= n) {
                summa += i;
                i++;
            }

            System.out.println("Summa ot 1 do " + n + " = " + summa);

            long faktorial = 1;
            i = 1;
            int schetchik = 0;

            while (i <= n) {
                faktorial *= i;
                i++;
                schetchik++;
            }

            System.out.println("Faktorial (while) = " + faktorial);
            System.out.println("Telo cikla vipolnilos " + schetchik + " raz.");

            long faktorial2 = 1;
            i = 1;

            do {
                faktorial2 *= i;
                i++;
            } while (i <= n);

            System.out.println("Faktorial (do-while) = " + faktorial2);
        }

        int k = 1;
        int summaK = 0;

        System.out.println("Promezhutochnie summi:");

        while (summaK <= 500) {
            summaK += k;
            System.out.println("k = " + k + ", summa = " + summaK);
            k++;
        }

        System.out.println("Minimalnoe k: " + (k - 1));

        scanner.close();
    }
}