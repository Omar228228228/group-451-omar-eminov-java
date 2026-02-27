package homework_9_5;

import java.util.Arrays;

    public class Task {
        public static void main(String[] args) {
        char[] symbols = new char[5];
        Arrays.fill(symbols, '*');
        System.out.println(Arrays.toString(symbols));
        Arrays.fill(symbols, 1, 4, '-');
        System.out.println(Arrays.toString(symbols));
        }
    }
