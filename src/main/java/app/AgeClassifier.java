package app;

public class AgeClassifier {
    public static void main(String[] args) {
        System.out.println(classify(5));
        System.out.println(classify(11));
        System.out.println(classify(20));
    }

    public static String classify(int age){
        if (age > 10) {
            return "Teenager";
        } else if (age >= 18){
            return "Mature";
        }
        else {
            return "Child";
        }
    }
}
