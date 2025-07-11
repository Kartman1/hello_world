package myownlist;

import java.util.List;

public class ListAccessTests {
    public static void main(String[] args) {
        List<String> items= List.of("Alpha", "Betta");

        System.out.println("items.indexOf(\"Betta\") = " + items.indexOf("Betta"));
    }
}
