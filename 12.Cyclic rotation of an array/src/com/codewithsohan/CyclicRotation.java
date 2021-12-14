package com.codewithsohan;

import java.util.Scanner;

public class CyclicRotation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //n is the length of an array example
        // (3 4 5 6 1 ) = 5 is the length input should 5 only
        // input 1
        int n = sc.nextInt();
        // array defining n is the length
        int arr[] = new int[n];
        // loop the input array it should not be less than n input length
        for (int i = 0; i < n; i++) {
            // taking the input of the n length of an array
            // input 2
            arr[i] = sc.nextInt();
        }
        // defining the k is the number of times rotation
        // input 3
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static int[] cyclicRotation(int n, int[] arr, int k) {

      for (int i = 0; i <=k; i++){
          int j ,first;
          // store the first element of an array
          first = arr[0];

          for (j = 0; j < n - 1; j++){
              // shift the element of an array by one
              arr[j] = arr[j +1];

          }
          // First element of an array will be added to the end
          arr[j] = first;
      }
      return arr;

    }
}