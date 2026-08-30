package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PairPrinter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String currentS = iterator.next();
            String nextS = iterator.next();
            System.out.println(currentS + " " + nextS);
        }
    }
}
