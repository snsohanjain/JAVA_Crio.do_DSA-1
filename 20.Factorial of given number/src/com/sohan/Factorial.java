package com.sohan;

import java.util.Scanner;

public class Factorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);
    }

    // TODO: Implement this method
    static int factorial(int n) {
        //System.out.println("printing n: " + n);
        // base case
        // when n = 1 then  we have to return 1
        // when n = 0 then  we have to return 1
        if (n == 1 || n == 0){
           // System.out.println("Hit the base case where n: "+ n);
            return 1;
        }
        if ( n < 0){
            //System.out.println("This Shouldn't happened");
            return -1;
        }
        // recursion
        int factorialOutput = n * factorial(n - 1);
        return factorialOutput;
    }
}
