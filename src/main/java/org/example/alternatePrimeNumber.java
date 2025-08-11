package org.example;

public class alternatePrimeNumber {


    public boolean isPrime(int num) {

        if (num <= 1) {

            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int count = 1;
        alternatePrimeNumber at = new alternatePrimeNumber();
        for (int i = 1; i <= 20; i++) {
            if (at.isPrime(i)) {
                if(count%2==0){
                    System.out.println(i);
                }
                count++;
            }

        }
    }
}