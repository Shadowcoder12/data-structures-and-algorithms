package javaSolutions;

import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void printPrimes(int number) {

        // storing all given numbers in params to true 
        boolean[] prime = new boolean[number +1];
        int i;

        for(i =2; i<=number; i++){
            prime[i] = true;
        }
        // intial bool array output
        System.out.println("Intial bool array output:" + Arrays.toString(prime));
        // checking if divisor is marked prime , then go through multiples starting at 2 * divisor and mark multiples as false 
        for(int divisor = 2; (divisor * divisor)<=number;divisor++) {
            if(prime[divisor]) {
                for(i = 2 * divisor; i<=number; i= i + divisor) {
                    prime[i] = false;
                }
            }
        }
        // print all numbers that are prime by utilizing the index
        for(i = 2; i<=number; i++){
            if(prime[i]) {
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println("Final bool array output:" + Arrays.toString(prime));
    }
    public static void main(String[] args) {
        printPrimes(10);
    }
}