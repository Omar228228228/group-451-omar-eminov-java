package homework_9_7;

import java.util.Arrays;
public class Task {public static void main(String[] args) {
        String[] array1 = {"Hello", "Shahbaz"};
        String[] array2 = {"Hello", "shahbaz"};
        String[] array3 = {"Hello", "Java"};
        System.out.println("array1 == array2: " + array1.equals(array2)); 
        // false        
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2)); 
        // true
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3)); 
        // false
    }  
}
