package array;

import java.util.*;

public class MapTests {
    public static void main(String[] args) {
        Map<String, Integer> peopleAge = new HashMap<>();

        //Add
        peopleAge.put("Igor", 30);
        peopleAge.put("Maxim", 30);
        peopleAge.put("John", 25);

        System.out.println("peopleAge.get(\"Igor\") = " + peopleAge.get("Igor"));
        System.out.println("peopleAge.get(\"NON-EXISTING-KEY\") = " + peopleAge.get("NON-EXISTING-KEY"));

        for (String key : peopleAge.keySet()){
            System.out.println("key = " + key);
        }

        for (Integer value : peopleAge.values()){
            System.out.println("value = " + value);
        }

        System.out.println("peopleAge.containsValue() = " + peopleAge.containsValue("Igor"));
        System.out.println("peopleAge.containsKey(\"Igor\") = " + peopleAge.containsKey("Igor"));

        for (Map.Entry<String, Integer> entry : peopleAge.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }

        int[] count = new int[10];
        for (int i : count) {
            count[i] = i;
        }
        System.out.println("Arrays.toString(count) = " + Arrays.toString(count));

        Collections.emptyMap();

        Map<String, Integer> peopleAges = Map.of(
                "Igor", 22,
                "Maxim", 25,
                "John", 30
        );
        System.out.println("peopleAges = " + peopleAges);

    }
}
