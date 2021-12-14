package com.codewithsohan;

import java.util.Scanner;

public class AverageHeight {

    public static float averageHeight(int n , float[] a){
        // iterate through an array
        float sum = 0;
        for ( float i : a){
            // find the sum of an element
            sum = sum + i ;

        }
        // divide the sum by number of element in array
        float avg = sum / (a.length);
        // return the average
        return avg;
    }


    public static void main (String args []){

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        float a[] = new float[n];

        for (int i = 0; i < n; i++){
            a[i] = Float.parseFloat(scanner.next());
        }
        float avgHeight = averageHeight(n , a);
        System.out.println(avgHeight);

    }


}
