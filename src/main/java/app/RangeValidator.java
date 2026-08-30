package app;

public class RangeValidator {
    public static void main(String[] args) {
        System.out.println(validate(-1));
        System.out.println(validate(1));
        System.out.println(validate(256));
    }

    private static int validate(int value) {
        if (value < 0 && value > 255) {
            throw new IllegalArgumentException(
                    "value is out of range");
        }
        return value;
    }
}
