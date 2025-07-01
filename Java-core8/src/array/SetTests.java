package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetTests {
    public static void main(String[] args) {
        String text = "Igor Matvienko\nIgor Petrenko\nBill Gates";

        Set<String> uniqueName = new HashSet<>();

        ArrayList<String> first = new ArrayList<>();
        first.add("Dima");
        first.add("Dasha");
        first.add("Diana");

        System.out.println("first = " + first);
        System.out.println("first.size() = " + first.size());

        first.remove(1);

        System.out.println("first = " + first);
        System.out.println("first.size() = " + first.size());

        first.clear();
        System.out.println("first = " + first);

        String[] fullNames = text.split("\n");
        for (String fullName : fullNames){
            String[] nameParts = fullName.split(" ");

            String firstName = nameParts[0];

            uniqueName.add(firstName);
        }

        System.out.println("uniqueName = " + uniqueName);
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        System.out.println("numbers = " + numbers);
    }
}
