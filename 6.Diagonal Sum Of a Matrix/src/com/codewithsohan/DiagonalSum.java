package com.codewithsohan;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int diagonalSum(int n, int[][] a) {

        int diagSum = 0;
        // Take a stab at the high-level logic & write it down.
        // 1. Make sure that i read the number and print the matrix
        // for (int i = 0; i < n ; i++){
            // for (int j = 0; j < n ; j++){
               // System.out.println(a [i] [j] + " ");
           //}// for j
            //System.out.println(" ");
      //  } // for i

        // 2.Loop through the matrix
        for (int i = 0 ; i < n ; i ++){
            // add arr+ [R0] [C0] + [R1] [C1] + [R2][C2]
            diagSum += a[i]  [i];

        }// for i
        // System.out.println("Diagnol sum: "+ diagSum);
        // 3. return the add number
        return diagSum;

    }

}
