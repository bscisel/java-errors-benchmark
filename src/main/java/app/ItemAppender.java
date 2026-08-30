package app;

import java.util.ArrayList;
import java.util.List;

public class ItemAppender {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (String s : list) {
            System.out.println(s);
            if (s.equals("b")) {
                list.add("x");
            }
        }
    }
}
