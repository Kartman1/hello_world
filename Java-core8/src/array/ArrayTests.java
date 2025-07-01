package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTests {
    public static void main(String[] args) {
        enum Seasons{
            Winter,
            Summer,
            Spring,
            Autum
        }

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Igor");
        names.add(0, "Ivan");
 //       names.add(1);
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());
        System.out.println("names.add(\"Dima\") = " + names.add("Dima"));
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());

        System.out.println(" Seasons= " + Seasons.Summer.ordinal());

        for (String name : names){
            System.out.println("name = " + name);
        }




    }
}
