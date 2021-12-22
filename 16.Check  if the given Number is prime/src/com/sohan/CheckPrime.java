package com.sohan;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPrime {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            nums.add(n);
        }

        ArrayList<Boolean> ans = checkPrime(t, nums);

        for (boolean res : ans) {
            System.out.println(res);
        }

    }

    // TODO: Implement this method
    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {

        ArrayList<Boolean> result = new ArrayList();

        // iterate through the list of numbers
        for (int n : nums){
            // keep a count variable
            int count = 0;
            // for  each number iterate form the 2 to sqrt of the number
            for (int i = 2; i <= Math.sqrt(n); i++){
                // if it is divisible increment the count
                if (n % i == 0)
                    count++;

            }// if the number is less than 2 or if the count is greater than zero it's not a prime number return false
             if (count > 0 || n < 2)
                 result.add(false);
             else
                 result.add(true);
        }
        // else return true
        return result;
    }
}
