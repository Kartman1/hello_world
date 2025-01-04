import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
//        int num = in.nextInt();
//        System.out.println(num);
//        System.out.println("Your number is " + num);
//        in.close();

        String[] names = new String[3];
        names[0] = "Dima";
        names[1] = "Sveta";
        names[2] = "Yura";

        System.out.println("names[0] = " + names[0]);
        System.out.println("names[1] = " + names[1]);
        System.out.println("names[2] = " + names[2]);

        // Initialize array during creation
        String[] fruits = {"apple", "Banana"};
        System.out.println("Arrays.toString(fruits) = " + Arrays.toString(fruits));

        System.out.println("fruits.length = " + fruits.length);

        //Test multidimentional arrays
        String[][] keyboard = {
                {"1", "2", "3"},
                {"3", "4", "5"},
                {"6", "7", "8"}
        };
        System.out.println("Arrays.toString(keyboard) = " + Arrays.toString(keyboard[0]));


    }
}
