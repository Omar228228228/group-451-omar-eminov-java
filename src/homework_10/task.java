package homework_10;
import java.util.Arrays;
import java.util.List;

public class task{
    public static void main(String[] args) {
        //1
        System.out.println("=== 1. Vvedenie v Java Arrays ===");
        System.out.println("Klass Arrays reshaet zadachi sortirovki, poiska, kopirovaniya");
        System.out.println("i sravneniya massivov. Polezen dlya uproshcheniya raboty s massivami");
        //2
        System.out.println("=== 2. Metod Arrays.copyOf() ===");
        int[] originalArray = {1, 2, 3};
        int[] enlargedArray = Arrays.copyOf(originalArray, 5);
        System.out.println("Iskhodnyy massiv: " + Arrays.toString(originalArray));
        System.out.println("Uvelichennyy massiv s nulyami: " + Arrays.toString(enlargedArray));        
        int[] enlargedArrayWithValue = Arrays.copyOf(originalArray, 5);
        for (int i = originalArray.length; i < enlargedArrayWithValue.length; i++) {
            enlargedArrayWithValue[i] = 10;
        }
        System.out.println("Uvelichennyy massiv so znacheniem 10: " + Arrays.toString(enlargedArrayWithValue));
        //3
        System.out.println("=== 3. Metod Arrays.copyOfRange() ===");
        int[] sourceArray = {10, 20, 30, 40, 50, 60, 70};
        int[] subArray = Arrays.copyOfRange(sourceArray, 2, 5);
        System.out.println("Iskhodnyy massiv: " + Arrays.toString(sourceArray));
        System.out.println("Podmassiv indexy 2-4: " + Arrays.toString(subArray));
        
        int[] subArrayDifferent = Arrays.copyOfRange(sourceArray, 1, 4);
        System.out.println("Podmassiv indexy 1-3: " + Arrays.toString(subArrayDifferent));

        //4
        System.out.println("=== 4. Metod Arrays.toString() ===");
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        String arrayAsString = Arrays.toString(stringArray);
        System.out.println("Massiv strok: " + arrayAsString);
        System.out.println("Polezno dlya bystrogo vyvoda soderzhimogo massiva");

        //5
        System.out.println("=== 5. Metod Arrays.fill() ===");
        char[] charArray = new char[5];
        Arrays.fill(charArray, 'A');
        System.out.println("Massiv s simvolami A: " + Arrays.toString(charArray));
        
        Arrays.fill(charArray, 'B');
        System.out.println("Massiv s simvolami B: " + Arrays.toString(charArray));

        //6
        System.out.println("=== 6. Metod Arrays.binarySearch() ===");
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int searchValue = 23;
        int index = Arrays.binarySearch(sortedArray, searchValue);
        System.out.println("Otsortirovannyy massiv: " + Arrays.toString(sortedArray));
        System.out.println("Indeks znacheniya " + searchValue + ": " + index);
        
        int searchNotFound = 99;
        int notFoundIndex = Arrays.binarySearch(sortedArray, searchNotFound);
        System.out.println("Indeks znacheniya " + searchNotFound + ": " + notFoundIndex);
        System.out.println("Binarnyy poisk bystree obychnogo pri bolshikh massivakh");

        //7
        System.out.println("=== 7. Metod Arrays.equals() ===");
        String[] fruits1 = {"apple", "banana", "orange"};
        String[] fruits2 = {"apple", "banana", "orange"};
        String[] fruits3 = {"apple", "kiwi", "orange"};
        
        System.out.println("Massiv 1: " + Arrays.toString(fruits1));
        System.out.println("Massiv 2: " + Arrays.toString(fruits2));
        System.out.println("Massiv 3: " + Arrays.toString(fruits3));
        System.out.println("fruits1 equals fruits2: " + Arrays.equals(fruits1, fruits2));
        System.out.println("fruits1 equals fruits3: " + Arrays.equals(fruits1, fruits3));
        System.out.println("Vazhno dlya sravneniya soderzhimogo, a ne ssylok");

        //8
        System.out.println("=== 8. Proverka nalichiya elementa ===");
        String[] languages = {"Java", "Python", "C#", "Ruby", "PHP"};
        List<String> languageList = Arrays.asList(languages);
        String searchLanguage = "Python";
        boolean containsPython = languageList.contains(searchLanguage);
        System.out.println("Massiv yazykov: " + Arrays.toString(languages));
        System.out.println("Soderzhit " + searchLanguage + ": " + containsPython);
        searchLanguage = "Swift";
        boolean containsSwift = languageList.contains(searchLanguage);
        System.out.println("Soderzhit " + searchLanguage + ": " + containsSwift);
        System.out.println("Udobno dlya bystroy proverki nalichiya elementa");
        //9
        System.out.println("=== 9. Massivy i Klonirovanie ===");
        int[] numbers = {1, 2, 3, 4, 5};
        int[] clonedNumbers = numbers.clone();  
        System.out.println("Iskhodnyy massiv: " + Arrays.toString(numbers));
        System.out.println("Klonirovannyy massiv: " + Arrays.toString(clonedNumbers));
        numbers[0] = 100;
        System.out.println("Posle izmeneniya iskhodnogo:");
        System.out.println("Iskhodnyy massiv: " + Arrays.toString(numbers));
        System.out.println("Klonirovannyy massiv: " + Arrays.toString(clonedNumbers));
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("copyOf alternativa: " + Arrays.toString(copyOfNumbers));
        System.out.println("Drugie sposoby: System.arraycopy, Arrays.copyOf");
    }
}