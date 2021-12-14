package com.codewithsohan;

import java.util.Scanner;

public class MaxInArray {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            int result = maxInArray(n , arr);
            System.out.println(result);
        }
    }
    public static int maxInArray (int n , int [] arr){

        // store the first element as a max
        int max = arr [0];
        // iterate the array
        for (int i = 1; i < arr.length; i++){
            // compare the max with remaining element of an array
            if (arr[i] > max){
                // replace the max element if any element is grater is found.
                max = arr[i];
            }
            // return the max element
        }return max;


    }


}
