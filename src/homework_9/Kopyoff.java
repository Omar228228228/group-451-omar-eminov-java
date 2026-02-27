package homework_9;

import java.util.Arrays;

public class Kopyoff {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println(Arrays.toString(original));
        int[] podelka = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(podelka));
    }
}
