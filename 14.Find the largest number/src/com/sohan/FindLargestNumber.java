package com.sohan;

import java.util.Scanner;

public class FindLargestNumber {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float result = findLargestNumber(a, b, c);

        if (result - (int) result == 0.0)
            System.out.println((int) result);
        else
            System.out.println(result);

    }

    // TODO: Implement this method
    static float findLargestNumber(float a, float b, float c) {

        // initialise the max variable
        float max = a;
        // compare a and b
        if (b > max){
            // find the max one
            max = b;
        }
        // compare with it c
        // set the max variable
        if (c > max){
            max = c;
        }
        // return the max
        return  max;

    }

}
