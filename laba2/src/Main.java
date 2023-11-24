import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Розміри двовимірного масиву
        int rows = 4;
        int columns = 3;

        // Створення двовимірного масиву цілих чисел та заповнення випадковими додатними значеннями
        int[][] intArray = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                intArray[i][j] = random.nextInt(25) * 2;
            }
        }

        // Створення одновимірного масиву рядків та заповнення символами
        int[] stringLengths = {5, 8, 6, 4};
        String[] stringArray = new String[rows];
        for (int i = 0; i < rows; i++) {
            char[] chars = new char[stringLengths[i]];
            Arrays.fill(chars, 'A');
            stringArray[i] = new String(chars);
        }

        // Сортування масиву рядків за зменшенням довжини
        Arrays.sort(stringArray, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        // Виведення результатів
        System.out.println("Двовимірний масив цілих чисел:");
        for (int[] row : intArray) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nОдновимірний масив рядків:");
        System.out.println(Arrays.toString(stringArray));
    }
}
