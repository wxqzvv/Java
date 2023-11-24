import java.util.Arrays;
import java.util.Scanner;

public class Control_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Сортування масиву цілих чисел
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Введіть елементи масиву: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        // 2. Зміна порядку символів у рядку
        System.out.print("Введіть рядок: ");
        scanner.nextLine(); // Очищення буфера введення
        String inputString = scanner.nextLine();

        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Результат: " + reversedString);

        // 3. Видалення літери "а" з рядка
        System.out.print("Введіть рядок для видалення літери 'a': ");
        String stringWithA = scanner.nextLine();

        String resultString = stringWithA.replaceAll("a", "");
        System.out.println("Результат: " + resultString);
    }
}
