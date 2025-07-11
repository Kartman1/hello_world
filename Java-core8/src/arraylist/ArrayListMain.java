package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println(array[2]);

        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1, 1001);

        System.out.println("list = " + list);
        System.out.println(list.get(3));
        list.remove(1);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(1) = " + list.contains(1));
        list.clear();
        System.out.println("list = " + list);
    }
}
