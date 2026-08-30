package app;

public class TypeNameFormatter {

    public static void main(String[] args) {
        String[] types = {"String", "Integer", "Double"};
        String[] typesUpper = new String[types.length];

        for (int i = 0; i < types.length; i++) {
            typesUpper[0] = types[0].toUpperCase();
        }

        for (String type : typesUpper) {
            System.out.println(type);
        }
    }
}
