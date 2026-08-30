package app;

public class SquareCalculator {
    public static void main(String[] args) {
        int number = 1_000_000;
        int result = number * number;

        System.out.printf("%,d%n", result);
    }
}
