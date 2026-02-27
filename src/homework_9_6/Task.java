package homework_9_6;

import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int key = 23;
        int index = Arrays.binarySearch(sortedArray, key);
        System.out.println( key + index);
        int truekey = 99;
        int missingIndex = Arrays.binarySearch(sortedArray, truekey);
        System.out.println(truekey + missingIndex); 
    }
}
