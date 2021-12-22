package com.sohan;

import java.util.AbstractMap;
import java.util.Scanner;

public class NumberOfDivisorsAndSum {

    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = numberOfDivisorsAndSum(n);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static int[] numberOfDivisorsAndSum(int n){
        // iterate from  1 to sqrt of n
        // initialise 2 variables sum and count to 0.
        int count = 0;
        int sum = 0;
        for ( int i = 1 ; i <= Math.sqrt(n); i++){
            // check if the n is divisible by the number.
            if (n % i == 0){
                // if it's divisible find it's pair check if it's distinct
                if ( n / i != i ){
                    // increment the count and compute the sum
                    count = count + 2;
                    sum = sum + i + n/i ;
                }else {
                    count++;
                    sum = sum + i;
                }

            }

        }
        // finally initialise result array with sum  and count
        int result [] = {count , sum};
        // return the array.
        return result;

    }
}
