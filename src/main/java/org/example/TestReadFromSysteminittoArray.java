package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TestReadFromSysteminittoArray {

//    public static String aggregateSingle(String name, String age, String planet){
//        Scanner input = new Scanner(System.in);
//        String[] person = new String[3];
//        person[0] = input.nextLine();
//        person[1] = input.nextLine();
//        person[2] = input.nextLine();
//        String result = String.format("name - %s, age - %s, planet - %s", person[0], person[1], person[2]);
//        System.out.println(result);
//        return result;
//    }

//    public static String[] aggregateAll(String[] names, int[] ages, String[] planets){
//        String[] result = new String[3];
//        result[0] = aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]);
//        result[1] = aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]);
//        result[2] = aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]);
//        System.out.println("result = " + result);
//        return result;
//    }

    public static void calculateMaxPower(){
        Scanner iputScan = new Scanner(System.in);
        int[] engines = new int[3];
        int enginemax = 0;
        float enginmaxFloat = 0.0f;
        engines[0] = iputScan.nextInt();
        engines[1] = iputScan.nextInt();
        engines[2] = iputScan.nextInt();
        iputScan.close();
        if((engines[0] >= engines[1]) && (engines[0] >= engines[2])){
            enginemax = engines[0];
        }else if((engines[1] >= engines[0]) && (engines[1] >= engines[2])){
            enginemax = engines[1];
        }else enginemax = engines[2];

        if(enginemax < 10){
            enginmaxFloat = (float)enginemax * 0.7f;
        }if((enginemax >= 10) && (enginemax <= 100)){
            enginmaxFloat = (float)enginemax * 1.2f;
        }else enginmaxFloat = (float)enginemax * 2.1f;

        System.out.println("engines = " + enginmaxFloat);
    }

    public static String getMyPrizes(int ticket){
        String result = "";
        if((ticket%10) == 0){
            result = "crystall";
        }
        if((ticket%10) == 7){
            result = result + " " + "chip";
        }
        if (ticket > 200) {
            result = result + " " + "coin";
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[3];
//        String[] names = {
//                "Alina",
//                "tanya",
//                "Diana"
//        };
//        int[] ages = {
//                18,
//                25,
//                28
//        };
//        String[] planets = {
//                "Mars",
//                "Venera",
//                "venera"
//        };
 //       System.out.println("aggregateAll(Lina, 18, Mars) = " + aggregateAll(names, ages, planets));
/*        Scanner scanner = new Scanner(System.in);

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
*/
//        calculateMaxPower();
        System.out.println("getMyPrizes() = " + getMyPrizes(207));
//        System.out.println("Arrays.toString() = " + Arrays.toString(numbers));
    }



}
