package com.codewithsohan;

import java.util.Scanner;

public class CheckMagicSquare {


    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    public static boolean isRowSumMagic(int n, int [][] grid, int sum ){

        // 00 01 02
        // 10 11 12
        // 29 21 22
        // 00 + 01 + 02
        // 10 + 11 + 12
        // have variable which iterate for a row
        // have a another  variable which iterate for a column
        for (int i = 0; i < n; i++){
            int rowSum = 0;
            for (int j = 0; j < n ; j++){
                // compute the sum of each row
                rowSum = rowSum + grid [i][j];

            }
            // check if they equal to the given sum
            if (!(rowSum == sum))
                return false;
        }
        return true;
    }
    public static boolean isColSumMagic(int n, int [][] grid, int sum ){

        // 00 01 02
        // 10 11 12
        // 29 21 22
        // 00 + 10 + 29
        // 00 + 10 + 29
        // have variable which iterate for a column
        // have a another  variable which iterate for a row
        for (int i = 0; i < n; i++){
            int colSum = 0;
            for (int j = 0; j < n ; j++){
                // compute the sum of each row
                colSum = colSum + grid [i][j];

            }
            // check if they equal to the given sum
            if (!(colSum == sum))
                return false;
        }
        return true;
    }
    public static boolean isDiagSumMagic(int n, int [][] grid, int sum ){

        // 00 01 02
        // 10 11 12
        // 29 21 22
        // 00 + 11 + 22
        // 02 + 11 + 29
        // have variable which iterate for a row
        // have a another  variable which iterate for a row
        // compute the sum of when row = col
        // compute the sum when col = n-1-row.
        // check if they  are equal to the given sum.
        // else return false.

        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < n; i++){

            diagSum1 = diagSum1 + grid [i] [i];
            diagSum2 = diagSum2 + grid [i] [n - 1 - i];

            // System.out.println(diagSum1);
            // System.out.println(diagSum2);
        }
        // check if they equal to the given sum
        if (!((diagSum1 == sum) && (diagSum2 == sum)))
            // else return false
            return false;
        return true;
    }
    public static int computeMagicSum(int n){
        // iterate from 1 till n*n
        int sum = 0;
        for (int i = 1; i <=n*n ; i++){
            // compute the sum of this sequence.
            sum = sum + i ;
        }
        // divide the sum by n
        int value = sum / n ;
        // return the value
        return value;
    }
    public static String checkMagicSquare(int n , int [][] grid){
        // calculate the sum which is intended for magicSquare of given n
        int sum = computeMagicSum(n);
        // calculate the sum of all row and check if each row sum equal intended sum.
        boolean isRowMagic = isRowSumMagic(n,grid,sum);
        // System.out.println(isRowMagic);
        // calculate the sum of all col and check if each col sum equal intended sum.
        boolean isColMagic = isColSumMagic(n,grid,sum);
        // System.out.println(isColMagic);
        // calculate the sum of all diagonals and check if each  sum equal intended sum.
        boolean isDiagMagic = isDiagSumMagic(n,grid,sum);
        // System.out.println(isDiagMagic);

        // if all above the condition  is satisfied say Yes else No.
        if ( isRowMagic && isColMagic && isDiagMagic){
            return "Yes";
        }
        return  "No";



    }

}
