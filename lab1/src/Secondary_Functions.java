import java.util.Scanner;

public class Secondary_Functions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Питаємо користувача ввести два дійсних числа
        System.out.print("Введіть перше дійсне число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге дійсне число: ");
        double num2 = scanner.nextDouble();

        // Знайдемо та виведемо середнє арифметичне квадратів чисел
        double averageSquare = (num1 * num1 + num2 * num2) / 2;
        System.out.println("Середнє арифметичне квадратів чисел: " + averageSquare);

        // Знайдемо та виведемо середнє геометричне – квадратний корінь з їхнього добутку
        double product = num1 * num2;
        if (product >= 0) {
            double geometricMean = Math.sqrt(product);
            System.out.println("Середнє геометричне: " + geometricMean);
        } else {
            System.out.println("Помилка: неможливо обчислити квадратний корінь з від'ємного числа");
        }

        // Зчитуємо ціле додатне число від користувача
        System.out.print("Введіть ціле додатне число: ");
        int positiveInt = scanner.nextInt();

        // Перевіряємо, чи є введене число простим
        if (isPrime(positiveInt)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // Перевіряємо, чи є введене число точним квадратом іншого цілого числа
        int squareRoot = (int) Math.sqrt(positiveInt);
        if (squareRoot * squareRoot == positiveInt) {
            System.out.println("Знайдене число: " + squareRoot);
        } else {
            System.out.println("no");
        }

        // Питаємо користувача ввести два цілих додатні числа
        System.out.print("Введіть перше ціле додатне число: ");
        int num3 = scanner.nextInt();

        System.out.print("Введіть друге ціле додатне число: ");
        int num4 = scanner.nextInt();

        // Знайти та вивести найменше спільне кратне цих чисел
        int lcm = findLCM(num3, num4);
        System.out.println("Найменше спільне кратне: " + lcm);

        // Закриваємо Scanner
        scanner.close();
    }

    // Рекурсивна функція обчислення суми квадратів перших n чисел
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + sumOfSquares(n - 1);
        }
    }

    // Рекурсивна функція обчислення добутку синусів перших n натуральних чисел
    public static double productOfSines(int n) {
        if (n == 1) {
            return Math.sin(1);
        } else {
            return Math.sin(n) * productOfSines(n - 1);
        }
    }

    // Функція для перевірки, чи є число простим
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Функція для знаходження найменшого спільного кратного
    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }

    // Функція для знаходження найбільшого спільного дільника
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}



