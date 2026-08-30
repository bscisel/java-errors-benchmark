package app;

public class ValueProcessor {
    public static void main(String[] args) {
        int value = -1;
        process(value);
    }

    private static void process(int value) {
        if (value < 0) {
            new IllegalArgumentException("Value is negative");
        }
        System.out.println("Value is positive or 0");
    }
}
