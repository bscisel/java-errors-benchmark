package app;

public class KeyValueParser {
    public static void main(String[] args) {
        String result = parseKeyValue("NameJohn");
        System.out.println(result);
    }

    public static String parseKeyValue(String entry) {
        int pos = entry.indexOf('=');
        String key = entry.substring(0, pos).trim();
        String value = entry.substring(pos + 1).trim();
        return "Key: " + key + ", Value: " + value;
    }
}
