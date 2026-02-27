package homework_9_8;

import java.util.Arrays;
public class Task {public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String searchColor = "Green";
        boolean found = false;
        for (String color : colors) {
            if (color.equals(searchColor)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchColor);
        } else {
            System.out.println(searchColor);
        }
    }

    
}
