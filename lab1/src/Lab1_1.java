import java.util.Scanner;

class Formula {

    public static double F(double x) {
        final int n = 9;
        double y;
        int k = 1;
        if (x < 3) {
            y = 0;
            for (int i = 1; i <= n; i++) {
                y = Math.cos(x - 3) + 2 * x;
            }
        } else {
            y = 1;
            for (int i = 1; i <= n; i++) {
                y *= Math.exp(-k * (x - 3));
            }
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        double x = scanner.nextDouble();
        double result = F(x);
        System.out.println("Result: " + result);
    }
}
