package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TestReadFromSysteminittoArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        System.out.println("Arrays.toString() = " + Arrays.toString(numbers));
    }
}
