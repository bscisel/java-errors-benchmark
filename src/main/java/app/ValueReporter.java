package app;

public class ValueReporter {
    public static void main(String[] args) {
        printSum();
        printUserLabel();
    }

    private static void printSum() {
        int x = 1;
        x =+ 2;
        System.out.println(x);
    }

    private static void printUserLabel() {
        String user = "User: " +
            + '"' + "John" + '"';
        System.out.println(user);
    }
}
