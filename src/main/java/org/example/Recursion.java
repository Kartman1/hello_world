package org.example;
import java.util.regex.*;

public class Recursion {
    public static void main(String[] args) {
        String str = "Skoda 200";
        String str2 = "***";
        String str3 = "";
        str3 = str2.replace("*", "");
        String result;
        System.out.println(factorial(4));
        System.out.println("intGet(\"Skoda 200\") = " + intGet(str));
        result = str.replaceAll("[\\d\\s]+", "");
        System.out.println("result = " + result);
        System.out.println("str3 = " + str3);
    }

    public static int factorial(int number){
        if(number == 0 || number == 0){
            return 1;
        }
        int result = number * factorial(number - 1);
        return result;
    }

    public static int intGet(String str){
        int number = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){

            number = Integer.parseInt(matcher.group());

        }
        return number;
    }
}
