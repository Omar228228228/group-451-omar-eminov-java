package homework_9_3;

import java.util.Arrays;

public class Co {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(numbers));
        int[] arr = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println( Arrays.toString(arr));
    }
}