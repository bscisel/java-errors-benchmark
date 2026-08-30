package app;

public class ScoreResolver {
    public static void main(String[] args) {
        System.out.println(valueOrZero(true, null));
    }

    private static Double valueOrZero(boolean condition, Double value) {
        return condition ? value : 0.0;
    }
}
