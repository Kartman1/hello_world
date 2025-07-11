package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GptExercises {
    public static void main(String[] args) {

        //Упражнение: Сравни ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start, end;

        for (Integer i = 0; i < 10000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("arrayList.get(15) = " + arrayList.get(9999));
        System.out.println("linkedList.get(5) = " + linkedList.get(5));

        start = System.nanoTime();
        arrayList.add(5);
        end = System.nanoTime();
        System.out.println("Время добавления в конец списка ArrayList= " + (end - start) + "наносекунд");
        start = System.nanoTime();
        arrayList.add(0, 8);
        end = System.nanoTime();
        System.out.println("Время добавления в начало списка ArrayList= " + (end - start) + "наносекунд");
        start = System.nanoTime();
        arrayList.add(5000, 25);
        end = System.nanoTime();
        System.out.println("Время добавления в середину списка ArrayList= " + (end - start) + "наносекунд");

        start = System.nanoTime();
        linkedList.add(5);
        end = System.nanoTime();
        System.out.println("Время добавления в конец списка linkedList= " + (end - start) + "наносекунд");
        start = System.nanoTime();
        linkedList.add(0, 8);
        end = System.nanoTime();
        System.out.println("Время добавления в начало списка linkedList= " + (end - start) + "наносекунд");
        start = System.nanoTime();
        linkedList.add(5000, 25);
        end = System.nanoTime();
        System.out.println("Время добавления в середину списка linkedList= " + (end - start) + "наносекунд");


        // Exercise 1
        List<String> names = new ArrayList<>();
        names.add("Dima");
        names.add("Katya");
        names.add("Diana");
        names.add("Ivan");
        names.add("Kolya");

        for (String name : names) {
            System.out.println("name = " + name);
        }

        // Exercise 2
        List<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Australia");

        System.out.println("names.get(2) = " + countries.get(2));

        // Exercise 3
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(15);
        numbers.add(4);

        System.out.println("numbers.contains(15) = " + numbers.contains(15));

        // Exercise 4

        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Апельсин");
        fruits.add("Киви");
        fruits.add("Банан");

        fruits.remove("Яблоко");

        System.out.println("fruits = " + fruits);

        // Exercise 5

        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(11);
        num.add(14);
        num.add(17);
        num.add(19);

        System.out.println("num.size() = " + num.size());

    }
}
