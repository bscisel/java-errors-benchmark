package app;

import java.util.HashMap;
import java.util.Map;

public class AttributeStore {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", null);
        System.out.println(map.getOrDefault("key1", "default"));
        System.out.println(map.containsKey("key1"));
        map.putIfAbsent("key1", "value1");
        System.out.println(map.getOrDefault("key1", "default"));
    }
}
