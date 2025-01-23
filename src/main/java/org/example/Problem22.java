package org.example;

public class Problem22 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
            System.out.println("isPrime(i) = " + isPrime(i));
        }
    }

    private static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }

        }
        return true;
    }
}
