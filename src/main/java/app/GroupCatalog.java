package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class GroupCatalog {
    public static void main(String[] args) {
        Set<List<String>> set = new HashSet<>();

        List<String> list = new ArrayList<>();
        set.add(list);

        System.out.println(set.contains(list));

        list.add("Hello");
        System.out.println(set.contains(list));
    }
}
